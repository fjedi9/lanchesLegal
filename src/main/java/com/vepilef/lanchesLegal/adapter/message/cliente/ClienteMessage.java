package com.vepilef.lanchesLegal.adapter.message.cliente;

import com.vepilef.lanchesLegal.adapter.message.EventoEnum;
import com.vepilef.lanchesLegal.adapter.repository.cliente.ClienteDto;

public interface ClienteMessage {
    public void enviaMensagem(EventoEnum evento, ClienteDto cliente);
}
