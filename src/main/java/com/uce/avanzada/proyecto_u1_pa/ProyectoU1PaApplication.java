package com.uce.avanzada.proyecto_u1_pa;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.avanzada.proyecto_u1_pa.ejemplo1.CodigoPostal;
import com.uce.avanzada.proyecto_u1_pa.ejemplo1.CodigoPostal2;
import com.uce.avanzada.proyecto_u1_pa.ejemplo1.CodigoPostal3;
import com.uce.avanzada.proyecto_u1_pa.ejemplo2.Cajero;
import com.uce.avanzada.proyecto_u1_pa.ejemplo2.Cajero2;
import com.uce.avanzada.proyecto_u1_pa.ejemplo2.Cajero3;
import com.uce.avanzada.proyecto_u1_pa.ejemplo3.Reserva;
import com.uce.avanzada.proyecto_u1_pa.ejemplo3.Reserva2;
import com.uce.avanzada.proyecto_u1_pa.ejemplo3.Reserva3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoU1PaApplication implements CommandLineRunner{
	// DI por atributo
	// @Autowired
	// private CitaMedica citaMedica;
	
	

	// @Autowired
    // private Doctor doctor;

    // @Autowired
    // private Paciente paciente;

	// Taller 5
	// @Autowired
	// private CitaMedica2 citaMedica;

	// Tarea 5

	@Autowired
	private CodigoPostal codigoPostal;
	@Autowired
	private CodigoPostal2 codigoPostal2;
	@Autowired
	private CodigoPostal3 codigoPostal3;

	@Autowired
	private Cajero cajero;
	@Autowired
	private Cajero2 cajero2;
	@Autowired
	private Cajero3 cajero3;

	@Autowired
	private Reserva reserva;
	@Autowired
	private Reserva2 reserva2;
	@Autowired
	private Reserva3 reserva3;
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Taller 5
		// System.out.println("Mi primer proyecto con Spring Framework");
		
		
		// String c =this.citaMedica.agendar(LocalDateTime.now(), "Javier", "Teran", 32, "Quito", "Pepito", 19);
		// System.out.println(c.toString());

		// Tarea 5

		String cP1 = this.codigoPostal.generarCodigo("Shumiral", "Ecuador", "El Oro", "12345");
		String cP2 = this.codigoPostal2.generarCodigo("Shumiral", "Ecuador", "El Oro", "12345");
		String cP3 = this.codigoPostal3.generarCodigo("Shumiral", "Ecuador", "El Oro", "12345");
		
		System.out.println(cP1.toString());
		System.out.println(cP2.toString());
		System.out.println(cP3.toString());

		String c1 = this.cajero.realizarOrden("Pablo", "123456789-2","3663628813", "Hamburguesa", new BigDecimal("2.5"), true);
		String c2 = this.cajero2.realizarOrden("Pablo", "123456789-2","3663628813", "Hamburguesa", new BigDecimal("2.5"), true);
		String c3 = this.cajero3.realizarOrden("Pablo", "123456789-2","3663628813", "Hamburguesa", new BigDecimal("2.5"), true);

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());

		String r1 = this.reserva.agendarReserva("Prius", "Toyota", "ABC-1234", new BigDecimal("3000.00"), LocalDateTime.of(2022, 06, 06, 01, 01, 01));
		String r2 = this.reserva2.agendarReserva("Prius", "Toyota", "ABC-1234", new BigDecimal("3000.00"),  LocalDateTime.of(2022, 06, 06, 01, 01, 01));
		String r3 = this.reserva3.agendarReserva("Prius", "Toyota", "ABC-1234", new BigDecimal("3000.00"), LocalDateTime.of(2022, 06, 06, 01, 01, 01));
		
		
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());

	}	

}
