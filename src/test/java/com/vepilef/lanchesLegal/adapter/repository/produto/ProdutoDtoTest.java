package com.vepilef.lanchesLegal.adapter.repository.produto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.vepilef.lanchesLegal.core.entity.produto.Produto;
import com.vepilef.lanchesLegal.core.enums.Categoria;
import com.vepilef.lanchesLegal.utils.produto.ProdutoEnum;
import com.vepilef.lanchesLegal.utils.produto.ProdutoPadrao;

class ProdutoDtoTest {

    private ProdutoDto produtoDto;
    private ProdutoPadrao produtoPadrao;

    private final Long idProdutoPadrao = (Long) ProdutoEnum.ID_PRODUTO.getValor();
    private final String nomePadrao = (String) ProdutoEnum.NOME.getValor();
    private final String descricaoPadrao = (String) ProdutoEnum.DESCRICAO.getValor();
    private final BigDecimal precoPadrao = (BigDecimal) ProdutoEnum.PRECO.getValor();
    private final Integer tempoPreparoPadrao = (Integer) ProdutoEnum.TEMPO_PREPARO.getValor();
    private final String imagemPadrao = (String) ProdutoEnum.IMAGEM.getValor();    
    
    @BeforeEach
    void beforeEach(){
        produtoPadrao = new ProdutoPadrao();
    }    

    @Test
    void constructorAllArgumentsTest(){
        produtoDto = produtoPadrao.createProdutoDto();
        
        assertEquals(idProdutoPadrao, produtoDto.idProduto());
        assertEquals(Categoria.ACOMPANHAMENTO, produtoDto.categoria());
        assertEquals(nomePadrao, produtoDto.nome());
        assertEquals(descricaoPadrao, produtoDto.descricao());
        assertEquals(precoPadrao, produtoDto.preco());
        assertEquals(tempoPreparoPadrao, produtoDto.tempoPreparo());
        assertEquals(imagemPadrao, produtoDto.imagem());
    }

    @Test
    void constructorByProdutoTest(){
        Produto produto = produtoPadrao.createProduto();
        produtoDto = new ProdutoDto(produto);

        assertEquals(idProdutoPadrao, produtoDto.idProduto());
        assertEquals(Categoria.ACOMPANHAMENTO, produtoDto.categoria());
        assertEquals(nomePadrao, produtoDto.nome());
        assertEquals(descricaoPadrao, produtoDto.descricao());
        assertEquals(precoPadrao, produtoDto.preco());
        assertEquals(tempoPreparoPadrao, produtoDto.tempoPreparo());
        assertEquals(imagemPadrao, produtoDto.imagem());
    }    
}
