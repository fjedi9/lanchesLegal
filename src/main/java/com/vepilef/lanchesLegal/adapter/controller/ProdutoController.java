package com.vepilef.lanchesLegal.adapter.controller;

import com.vepilef.lanchesLegal.adapter.repository.produto.ProdutoDto;
import com.vepilef.lanchesLegal.core.enums.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface ProdutoController {
    public Page<ProdutoDto> consultaPaginada(Pageable paginacao);
    public List<ProdutoDto> consultaByCategoria(Categoria categoria);
    public ProdutoDto detalhar(Long id);
    public ProdutoDto cadastrar(ProdutoDto dto);
    public ProdutoDto alterar(Long id, ProdutoDto dto);
    public void excluir(Long id);
}

