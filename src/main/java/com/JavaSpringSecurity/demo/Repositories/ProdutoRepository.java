package com.JavaSpringSecurity.demo.Repositories;

import com.JavaSpringSecurity.demo.Models.ProdutoModels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModels, Long> {
}
