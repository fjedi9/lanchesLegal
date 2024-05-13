package com.vepilef.lanchesLegal.utils.produto;

import java.math.BigDecimal;

import com.vepilef.lanchesLegal.adapter.repository.produto.ProdutoDto;
import com.vepilef.lanchesLegal.core.entity.produto.Produto;
import com.vepilef.lanchesLegal.core.enums.Categoria;
import com.vepilef.lanchesLegal.adapter.repository.produto.ProdutoDto;
import com.vepilef.lanchesLegal.core.entity.produto.Produto;

public class ProdutoPadrao {

    public Produto createProduto(){
        return new Produto((Long) ProdutoEnum.ID_PRODUTO.getValor(), 
                           Categoria.ACOMPANHAMENTO, 
                           (String) ProdutoEnum.NOME.getValor(), 
                           (String) ProdutoEnum.DESCRICAO.getValor(), 
                           (BigDecimal) ProdutoEnum.PRECO.getValor(), 
                           (Integer) ProdutoEnum.TEMPO_PREPARO.getValor(), 
                           (String) ProdutoEnum.IMAGEM.getValor(), 
                           0);
    }

    public ProdutoDto createProdutoDto(){
        return new ProdutoDto((Long) ProdutoEnum.ID_PRODUTO.getValor(), 
                              Categoria.ACOMPANHAMENTO, 
                              (String) ProdutoEnum.NOME.getValor(), 
                              (String) ProdutoEnum.DESCRICAO.getValor(), 
                              (BigDecimal) ProdutoEnum.PRECO.getValor(), 
                              (Integer) ProdutoEnum.TEMPO_PREPARO.getValor(), 
                              (String) ProdutoEnum.IMAGEM.getValor());
    }    
}
