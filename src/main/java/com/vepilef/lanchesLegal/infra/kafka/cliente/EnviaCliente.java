package com.vepilef.lanchesLegal.infra.kafka.cliente;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.vepilef.lanchesLegal.adapter.message.EventoEnum;
import com.vepilef.lanchesLegal.adapter.message.cliente.ClienteEvent;
import com.vepilef.lanchesLegal.adapter.message.cliente.ClienteMessage;
import com.vepilef.lanchesLegal.adapter.repository.cliente.ClienteDto;

@Service
public class EnviaCliente implements ClienteMessage {

    private final KafkaTemplate<String, Object> kafka;

    public EnviaCliente(KafkaTemplate<String, Object> kafka) {
        this.kafka = kafka;
    }

    @Override
    public void enviaMensagem(EventoEnum evento, ClienteDto cliente) {
        ClienteEvent clienteEvent = new ClienteEvent(evento, cliente);

        kafka.send("topico-cliente-pedido", clienteEvent);
    }
}
