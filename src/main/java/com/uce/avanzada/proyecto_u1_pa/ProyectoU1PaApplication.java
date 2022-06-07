package com.uce.avanzada.proyecto_u1_pa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.avanzada.proyecto_u1_pa.modelo.Estudiante;
import com.uce.avanzada.proyecto_u1_pa.modelo.Materia;
import com.uce.avanzada.proyecto_u1_pa.modelo.Matricula;
import com.uce.avanzada.proyecto_u1_pa.service.IEstudianteService;
import com.uce.avanzada.proyecto_u1_pa.service.IMateriaService;
import com.uce.avanzada.proyecto_u1_pa.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1PaApplication implements CommandLineRunner{
	
	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IMatriculaService matriculaService;

	@Autowired 
	private IMateriaService materiaService;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Estudiante e = new Estudiante();
		Estudiante e1 = new Estudiante();

		e.setNombre("Paulo");
		e.setApellido("Aldaz");
		e.setCedula("1787873400-4");

		this.estudianteService.ingresarEstudiante(e);
		
		e1.setNombre("Pedro");
		e1.setApellido("Santo");
		e1.setCedula("178353400-5");

		this.estudianteService.ingresarEstudiante(e1);

		// Actualizar
		e.setCedula("1787873400-4");
		this.estudianteService.actualizarEstudiante(e);

		// Buscar
		this.estudianteService.buscarPorApellido("Santo");

		// Eliminar

		this.estudianteService.borrarEstudiante("178353400-5");

		
	}	

}
