package com.uce.avanzada.proyecto_u1_pa.repository;

import com.uce.avanzada.proyecto_u1_pa.modelo.Estudiante;

import org.springframework.stereotype.Repository;

@Repository
public class EstudianteRepositoryImpl implements IEstudianteRepository {

    @Override
    public void insertar(Estudiante e) {
        // Aqui se realiza insercion
        System.out.println("Se ha insertado en la base " + e);
        
    }

    @Override
    public Estudiante buscar(String apellido) {
        System.out.println("Se ha buscado en la base " + apellido);
        return null;
    }

    @Override
    public void actualizar(Estudiante e) {
        System.out.println("Se ha actualizado en la base " + e);
        
    }

    @Override
    public void eliminar(String cedula) {
        System.out.println("Se ha eliminado de la base " + cedula);
        
    }
    
}
