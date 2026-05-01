package com.JavaSpringSecurity.demo.Repositories;

import com.JavaSpringSecurity.demo.Models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
