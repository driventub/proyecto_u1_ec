package com.uce.avanzada.proyecto_u1_pa.repository;

import org.springframework.stereotype.Repository;

import com.uce.avanzada.proyecto_u1_pa.modelo.Materia;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository {

    @Override
    public void insertar(Materia e) {
        // Aqui se realiza insercion
        System.out.println("Se ha insertado en la base " + e);
        
    }

    @Override
    public Materia buscar(String semestre) {
        System.out.println("Se ha buscado en la base " + semestre);
        Materia e = new Materia();
        e.setSemestre(semestre);
        return e;
    }

    @Override
    public void actualizar(Materia e) {
        System.out.println("Se ha actualizado en la base " + e);
        
    }

    @Override
    public void eliminar(String cedula) {
        System.out.println("Se ha eliminado de la base " + cedula);
        
    }
    
}
