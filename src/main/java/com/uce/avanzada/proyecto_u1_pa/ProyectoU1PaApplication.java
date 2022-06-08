package com.uce.avanzada.proyecto_u1_pa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.avanzada.proyecto_u1_pa.banco.repository.IDepositoRepo;
import com.uce.avanzada.proyecto_u1_pa.banco.service.IDepositoService;
import com.uce.avanzada.proyecto_u1_pa.banco.service.ITransferenciaService;
import com.uce.avanzada.proyecto_u1_pa.modelo.Estudiante;
import com.uce.avanzada.proyecto_u1_pa.modelo.Materia;
import com.uce.avanzada.proyecto_u1_pa.modelo.Matricula;
import com.uce.avanzada.proyecto_u1_pa.service.IEstudianteService;
import com.uce.avanzada.proyecto_u1_pa.service.IMateriaService;
import com.uce.avanzada.proyecto_u1_pa.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1PaApplication implements CommandLineRunner{
	
	@Autowired
	private ITransferenciaService transferenciaService;

	@Autowired
	private IDepositoService depositoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		transferenciaService.realizar("12", "13", new BigDecimal("2"));

		depositoService.realizar("12",new BigDecimal( "50"));
			}	

}
