package com.vepilef.lanchesLegal.infra.kafka.cliente;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.kafka.core.KafkaTemplate;

import com.vepilef.lanchesLegal.adapter.message.EventoEnum;
import com.vepilef.lanchesLegal.adapter.message.cliente.ClienteEvent;
import com.vepilef.lanchesLegal.adapter.repository.cliente.ClienteDto;
import com.vepilef.lanchesLegal.core.enums.Logado;

class EnviaClienteTest {
    private EnviaCliente enviaCliente;

    private static final String CPF = "68330488004";
    private static final String NOME = "teste";
    private static final String EMAIL = "teste@teste.com";

    @Mock
    KafkaTemplate<String, Object> kafka;

    @BeforeEach
    @SuppressWarnings("unchecked")    
    void beforeEach(){
        kafka = Mockito.mock(KafkaTemplate.class);
        enviaCliente = new EnviaCliente(kafka);
    }

    @Test
    void constructorEnviaProdutoTest(){
        enviaCliente = new EnviaCliente(kafka);

        assertNotEquals(null, enviaCliente);
    }

    @Test
    void enviaMensagemTest(){
        ClienteDto clienteDto;
        clienteDto = new ClienteDto(CPF, NOME, EMAIL, Logado.NAO);

        when(kafka.send(anyString(), any(ClienteEvent.class))).thenReturn(null);
        assertDoesNotThrow(()->enviaCliente.enviaMensagem(EventoEnum.CREATE, clienteDto));
    }
}
