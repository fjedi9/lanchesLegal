package com.vepilef.lanchesLegal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(title="API lanches Legal", version = "24.01.20", description = "Tech Lanches"),
        servers = { @Server(url="http://localhost:8080"), @Server(url="http://localhost:32100") }
)
public class lanchesLegal {
    public static void main(String[] args) {
        SpringApplication.run(lanchesLegal.class, args);
    }

}
