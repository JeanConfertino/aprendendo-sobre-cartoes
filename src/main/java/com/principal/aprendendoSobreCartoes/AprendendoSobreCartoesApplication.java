package com.principal.aprendendoSobreCartoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info = @Info(
				title = "API de Aprendizado Sobre Cartões",
				version = "1.0",
				description = "Projeto para estudo de APIs REST, incluindo CRUD de usuários, tratamento de exceções e testes."
		)
)
@SpringBootApplication
public class AprendendoSobreCartoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AprendendoSobreCartoesApplication.class, args);
	}
}
