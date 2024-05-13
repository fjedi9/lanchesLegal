package com.vepilef.lanchesLegal.adapter.repository.produto;

import java.math.BigDecimal;

import com.vepilef.lanchesLegal.core.entity.produto.Produto;
import com.vepilef.lanchesLegal.core.enums.Categoria;
import io.swagger.v3.oas.annotations.media.Schema;

public record ProdutoDto(@Schema(description = "Código do produto após ser criado", example = "1", required = true)
                         long idProduto,
                         @Schema(implementation = Categoria.class, description = "Categoria do produto", example = "LANCHE", required = true)
                         Categoria categoria,
                         @Schema(description = "Nome do produto", example = "X-Tudo", required = true, maxLength = 30)
                         String nome,
                         @Schema(description = "Descrição do produto",
                                 example = "pão, 2 carnes, queijo, presunto, bacon, ovo, alface, tomate, milho e batata.",
                                 required = true,
                                 maxLength = 200)
                         String descricao,
                         @Schema(description = "Preço do produto", example = "19.32", required = true)
                         BigDecimal preco,
                         @Schema(description = "Tempo em minutos necessário para preparar todo o produto.", example = "35")
                         int tempoPreparo,
                         @Schema(description = "Caminho onde a imagem se encontra disponibilizada",
                                 example ="",
                                 maxLength = 400)
                         String imagem) {
    public ProdutoDto(Produto produto) {
        this(produto.getIdProduto(),
                produto.getCategoria(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getPreco(),
                produto.getTempoPreparo(),
                produto.getImagem());
    }
}