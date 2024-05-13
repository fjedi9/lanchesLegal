package com.vepilef.lanchesLegal.adapter.message.produto;

import com.vepilef.lanchesLegal.adapter.message.EventoEnum;
import com.vepilef.lanchesLegal.adapter.repository.produto.ProdutoDto;

public interface ProdutoMessage {
    public void enviaMensagem(EventoEnum evento, ProdutoDto produto);
}