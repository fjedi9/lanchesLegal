package com.vepilef.lanchesLegal.bdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.vepilef.lanchesLegal.adapter.message.produto.ProdutoMessage;
import com.vepilef.lanchesLegal.adapter.repository.produto.ProdutoDto;
import com.vepilef.lanchesLegal.adapter.repository.produto.ProdutoRepository;
import com.vepilef.lanchesLegal.core.entity.produto.Produto;
import com.vepilef.lanchesLegal.core.service.ProdutoService;
import com.vepilef.lanchesLegal.utils.produto.ProdutoPadrao;

class ProdutoServiceBDDTest {

    private ProdutoService produtoService;
    private ProdutoDto produtoDtoTeste;
    private ProdutoPadrao produtoPadrao;

    @Mock
    private ProdutoRepository produtoRepository;

    @Mock
    private ProdutoMessage produtoMessage;

    AutoCloseable openMocks;

    @BeforeEach
    void beforeEach(){
        openMocks = MockitoAnnotations.openMocks(this);
        
        produtoPadrao = new ProdutoPadrao();
        produtoDtoTeste = produtoPadrao.createProdutoDto();
        produtoService = new ProdutoService(produtoRepository, produtoMessage);
    }

    @AfterEach
    void afterEach() throws Exception {
      openMocks.close();
    }

    @Test
    void testCadastrar() {
        given(produtoRepository.save(any(Produto.class))).willReturn(produtoPadrao.createProduto());

        ProdutoDto produtoDtoRes = produtoService.cadastrar(produtoDtoTeste);
        assertEquals(0L, produtoDtoRes.idProduto());
        assertEquals(produtoDtoTeste.categoria(), produtoDtoRes.categoria());
        assertEquals(produtoDtoTeste.nome(), produtoDtoRes.nome());
        assertEquals(produtoDtoTeste.descricao(), produtoDtoRes.descricao());
        assertEquals(produtoDtoTeste.preco(), produtoDtoRes.preco());
        assertEquals(produtoDtoTeste.tempoPreparo(), produtoDtoRes.tempoPreparo());
        assertEquals(produtoDtoTeste.imagem(), produtoDtoRes.imagem());
    }
}
