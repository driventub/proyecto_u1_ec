package com.uce.avanzada.proyecto_u1_pa;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.avanzada.proyecto_u1_pa.banco.service.IFachadaCuentaBancaria;


/**
 *	Yo lo tome desde el punto que deben haber 5 productos de un distribuidor, y que de ahi cuando mandamos
 * 	a importarlos se crea un inventario
 */
@SpringBootApplication
public class ProyectoU1PaApplication implements CommandLineRunner{
	
	@Autowired
	private IFachadaCuentaBancaria bancaria;
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		BigDecimal interes = this.bancaria.calcularInteres("123");
		System.out.println("El interes es: " + interes);
	
	}	

}
