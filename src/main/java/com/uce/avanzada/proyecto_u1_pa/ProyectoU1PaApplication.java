package com.uce.avanzada.proyecto_u1_pa;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.avanzada.proyecto_u1_pa.modelo.Estudiante;
import com.uce.avanzada.proyecto_u1_pa.modelo.Matricula;
import com.uce.avanzada.proyecto_u1_pa.modelo.ProfesorGeneral;
import com.uce.avanzada.proyecto_u1_pa.modelo.ProfesorMateria;
import com.uce.avanzada.proyecto_u1_pa.service.IMatriculaService;


/**
 *	Yo lo tome desde el punto que deben haber 5 productos de un distribuidor, y que de ahi cuando mandamos
 * 	a importarlos se crea un inventario
 */
@SpringBootApplication
public class ProyectoU1PaApplication implements CommandLineRunner{
	
	@Autowired
	private ProfesorGeneral general;

	@Autowired
	private ProfesorGeneral general1;


	@Autowired
	private ProfesorMateria materia;

	@Autowired
	private ProfesorMateria materia1;

	@Autowired
	private IMatriculaService iMatriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Ejemplo singleton");
		this.general.setNombre("nombre");
		this.general.setApelldo("apelldo");

		System.out.println(this.general.toString());
		System.out.println("--------------");
		System.out.println(this.general1);
		this.general1.setNombre("Pepito");
		System.out.println("--------------");
		System.out.println(this.general1);
		System.out.println("--------------");
		System.out.println(this.general);

		System.out.println("Ejemplo protoype");
		this.materia.setNombre("Ramiro");
		this.materia.setApelldo("Teran");

		
		System.out.println(this.materia);
		System.out.println("----------------");
		System.out.println(this.materia1);


		Matricula m1 = new Matricula();
		m1.setEstudiante(new Estudiante());
		m1.setMateria(new ArrayList<>());
		m1.setNumero("123");

		this.iMatriculaService.ingresarMatricula(m1);
	}	

}
