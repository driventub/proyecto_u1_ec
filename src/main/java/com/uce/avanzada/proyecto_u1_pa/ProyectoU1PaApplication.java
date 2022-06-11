package com.uce.avanzada.proyecto_u1_pa;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.avanzada.proyecto_u1_pa.banco.service.IRetiroService;

@SpringBootApplication
public class ProyectoU1PaApplication implements CommandLineRunner{
	
	@Autowired
	private IRetiroService retiroService;

	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.retiroService.retiro("287477", new BigDecimal("20.00"));
			}	

}
