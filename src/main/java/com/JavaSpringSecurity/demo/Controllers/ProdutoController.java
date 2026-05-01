package com.JavaSpringSecurity.demo.Controllers;

import com.JavaSpringSecurity.demo.Models.ProdutoModel;
import com.JavaSpringSecurity.demo.Services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping



public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoModel> criarProduto(@RequestBody ProdutoModel produtoModel) {
        ProdutoModel criado = produtoService.criarProduto(produtoModel);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(criado.getId())
                .toUri();

        return ResponseEntity.created(uri).body(criado);
    };

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoModel> buscarProduto(@PathVariable Long id) {
        return produtoService.buscarProduto(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
