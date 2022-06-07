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


		// Tarea 6
		
		// Lista de materias
		List<Materia> lista = new ArrayList<>();

		Materia m1 = new Materia();
		Materia m2 = new Materia();
		Materia m3 = new Materia();

		lista.add(m1);
		lista.add(m2);
		lista.add(m3);
		

		m1.setNombre("Matematica");
		m1.setSemestre("Septimo");
		
		
		

		m2.setNombre("Fisica");
		m2.setSemestre("Sexto");

		m3.setNombre("Quimica");
		m3.setSemestre("Septimo");
		
		// Insert
		this.materiaService.ingresarMateria(m1);
		this.materiaService.ingresarMateria(m2);
		this.materiaService.ingresarMateria(m3);

		
		


		// Read

		this.materiaService.buscarPorSemestre("Sexto");

		// Update

		m1.setNombre("Matematica II");
		m2.setNombre("Fisica II");
		m3.setNombre("Quimica II");

		// Delete
		this.materiaService.borrarMateria("Matematica");

		// Matriculacion
		Matricula matricula = new Matricula();
		matricula.setNumero("73773771");
		matricula.setEstudiante(e);
		matricula.setMateria(lista);

		// Insert
		this.matriculaService.ingresarMatricula(matricula);

		// Read
		this.matriculaService.buscarPorNumero("73773771");

		// Update

		matricula.setNumero("12345");;
		this.matriculaService.actualizarMatricula(matricula);

		// Delete
		this.matriculaService.borrarMatricula("12345");
	}	

}
