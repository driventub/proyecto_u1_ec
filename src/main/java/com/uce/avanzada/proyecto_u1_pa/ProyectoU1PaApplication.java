package com.uce.avanzada.proyecto_u1_pa;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.avanzada.proyecto_u1_pa.tarea10.modelo.ExamenHormonal;
import com.uce.avanzada.proyecto_u1_pa.tarea10.modelo.ExamenSanguineo;


/**
 *	Yo lo tome desde el punto que deben haber 5 productos de un distribuidor, y que de ahi cuando mandamos
 * 	a importarlos se crea un inventario
 */
@SpringBootApplication
public class ProyectoU1PaApplication implements CommandLineRunner{
	
	@Autowired
	private ExamenHormonal examenHormonal1;
	
	@Autowired
	private ExamenHormonal examenHormonal2;

	@Autowired
	private ExamenSanguineo examenSanguineo1;
	
	@Autowired
	private ExamenSanguineo examenSanguineo2;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Ejemplo Prototype");
		// Ejemplo Prototype
		this.examenHormonal1.setCedula("187737372-5");
		this.examenHormonal1.setFechaEntrega(LocalDateTime.of(2022,06,16,01,01,01));
		this.examenHormonal1.setNombrePaciente("Julio");
		this.examenHormonal1.setPrecio(new BigDecimal("20.00"));
		this.examenHormonal1.setTipo("H");

		
		
		System.out.println(this.examenHormonal1.toString());
		System.out.println(this.examenHormonal2.toString());

		this.examenHormonal2.setPrecio(new BigDecimal("19.00"));

		System.out.println(this.examenHormonal1.toString());
		System.out.println(this.examenHormonal2.toString());


		System.out.println("============================================================");

		System.out.println("Ejemplo Singleton");
		// Ejemplo Singleton
		this.examenSanguineo1.setCedula("187737372-5");
		this.examenSanguineo1.setFechaEntrega(LocalDateTime.of(2022,06,16,01,01,01));
		this.examenSanguineo1.setNombrePaciente("Julio");
		this.examenSanguineo1.setPrecio(new BigDecimal("20.00"));
		this.examenSanguineo1.setTipo("S");
		
		System.out.println(this.examenSanguineo1.toString());
		System.out.println(this.examenSanguineo2.toString());

		this.examenSanguineo2.setPrecio(new BigDecimal("19.00"));

		System.out.println(this.examenSanguineo1.toString());
		System.out.println(this.examenSanguineo2.toString());
	}	

}
