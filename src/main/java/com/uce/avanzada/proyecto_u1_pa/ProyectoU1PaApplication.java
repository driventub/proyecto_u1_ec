package com.uce.avanzada.proyecto_u1_pa;

import java.time.LocalDateTime;

import com.uce.avanzada.proyecto_u1_pa.consultorio.CitaMedica2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoU1PaApplication implements CommandLineRunner{
	// DI por atributo
	// @Autowired
	// private CitaMedica citaMedica;
	
	@Autowired
	private CitaMedica2 citaMedica;

	// @Autowired
    // private Doctor doctor;

    // @Autowired
    // private Paciente paciente;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mi primer proyecto con Spring Framework");
		
		
		String c =this.citaMedica.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19);
		System.out.println(c.toString());
	}	

}
