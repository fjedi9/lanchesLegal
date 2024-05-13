package com.vepilef.lanchesLegal.infra.kafka.produto;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.vepilef.lanchesLegal.adapter.message.EventoEnum;
import com.vepilef.lanchesLegal.adapter.message.produto.ProdutoEvent;
import com.vepilef.lanchesLegal.adapter.message.produto.ProdutoMessage;
import com.vepilef.lanchesLegal.adapter.repository.produto.ProdutoDto;

@Service
public class EnviaProduto implements ProdutoMessage {

    private final KafkaTemplate<String, Object> kafka;

    public EnviaProduto(KafkaTemplate<String, Object> kafka) {
        this.kafka = kafka;
    }

    @Override
    public void enviaMensagem(EventoEnum evento, ProdutoDto produto) {
        ProdutoEvent produtoEvent = new ProdutoEvent(evento, produto);

        kafka.send("topico-produto-pedido", produtoEvent);
    }
}
