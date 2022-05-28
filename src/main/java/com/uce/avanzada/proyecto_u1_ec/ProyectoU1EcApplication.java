package com.uce.avanzada.proyecto_u1_ec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoU1EcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mi primer proyecto con Spring Framework");
		
	}

}
