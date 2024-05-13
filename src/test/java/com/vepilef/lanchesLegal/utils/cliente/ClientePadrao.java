package com.vepilef.lanchesLegal.utils.cliente;

import com.vepilef.lanchesLegal.adapter.repository.cliente.ClienteDto;
import com.vepilef.lanchesLegal.core.entity.cliente.Cliente;
import com.vepilef.lanchesLegal.core.enums.Logado;
import com.vepilef.lanchesLegal.adapter.repository.cliente.ClienteDto;
import com.vepilef.lanchesLegal.core.entity.cliente.Cliente;

public class ClientePadrao {    

    public Cliente createClient(){
        return new Cliente(ClienteEnum.CPF.getValor(), 
                           ClienteEnum.NOME.getValor(), 
                           ClienteEnum.EMAIL.getValor(), 
                           Logado.NAO, 0);
    }

    public ClienteDto createClientDto(){
        return new ClienteDto(ClienteEnum.CPF.getValor(), 
                              ClienteEnum.NOME.getValor(), 
                              ClienteEnum.EMAIL.getValor(), 
                              Logado.NAO);
    }
}
