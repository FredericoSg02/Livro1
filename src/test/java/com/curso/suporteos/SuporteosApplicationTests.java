package com.curso.suporteos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.curso.domains", "com.curso.domains.enums"})
@SpringBootApplication
public class SuporteosApplicationTests {

	public static void main(String[] args) {
		SpringApplication.run(SuporteosApplicationTests.class, args); // Corrigido para rodar a classe correta
	}
}
