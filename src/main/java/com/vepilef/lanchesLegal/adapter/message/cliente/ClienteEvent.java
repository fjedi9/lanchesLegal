package com.vepilef.lanchesLegal.adapter.message.cliente;

import com.vepilef.lanchesLegal.adapter.message.EventoEnum;
import com.vepilef.lanchesLegal.adapter.repository.cliente.ClienteDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteEvent {
    private EventoEnum evento;
    private ClienteDto clienteDto;
}
