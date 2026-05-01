package com.JavaSpringSecurity.demo.Services;

import aj.org.objectweb.asm.commons.Remapper;
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

    public ProdutoModel criarProduto(ProdutoModel produtoModel) {

        return produtoRepository.save(produtoModel);
    }

    private Optional<ProdutoModel> buscarProdutoPorId(Long idProduto) {
        return produtoRepository.findById(idProduto);
    }

    public Remapper buscarProduto(Long id) {
        return null;
    }
}
