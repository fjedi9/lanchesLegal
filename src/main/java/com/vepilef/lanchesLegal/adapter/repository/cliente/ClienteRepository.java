package com.vepilef.lanchesLegal.adapter.repository.cliente;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vepilef.lanchesLegal.core.entity.cliente.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, String>{
}