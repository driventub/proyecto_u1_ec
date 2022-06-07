package com.uce.avanzada.proyecto_u1_pa.repository;

import org.springframework.stereotype.Repository;

import com.uce.avanzada.proyecto_u1_pa.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

    @Override
    public void insertar(Matricula e) {
        // Aqui se realiza insercion
        System.out.println("Se ha insertado en la base " + e);
        
    }

    @Override
    public Matricula buscar(String numero) {
        System.out.println("Se ha buscado en la base " + numero);
        Matricula e = new Matricula();
        e.setNumero(numero);
        return e;
    }

    @Override
    public void actualizar(Matricula e) {
        System.out.println("Se ha actualizado en la base " + e);
        
    }

    @Override
    public void eliminar(String numero) {
        System.out.println("Se ha eliminado de la base " + numero);
        
    }
    
}
