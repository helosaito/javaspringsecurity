package com.JavaSpringSecurity.demo.Services;

import com.JavaSpringSecurity.demo.Models.ProdutoModel;
import com.JavaSpringSecurity.demo.Repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    private List<ProdutoModel> findAll() {
        return produtoRepository.findAll();
    }

    private ProdutoModel criarProduto(ProdutoModel produtoModel) {

        return produtoRepository.save(produtoModel);
    }

    private Optional<ProdutoModel> buscarProdutoPorId(Long idProduto) {
        return produtoRepository.findById(idProduto);
    }
}
