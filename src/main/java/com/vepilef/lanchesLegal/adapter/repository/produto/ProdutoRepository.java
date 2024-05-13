package com.vepilef.lanchesLegal.adapter.repository.produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vepilef.lanchesLegal.core.entity.produto.Produto;
import com.vepilef.lanchesLegal.core.enums.Categoria;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

    @Query(value = "SELECT * FROM produtos WHERE categoria = :#{#categoria?.ordinal()}", nativeQuery = true)
    List<Produto> findByCategoria(@Param("categoria") Categoria categoria);
}