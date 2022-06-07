package com.uce.avanzada.proyecto_u1_pa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.avanzada.proyecto_u1_pa.modelo.Matricula;
import com.uce.avanzada.proyecto_u1_pa.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{


    @Autowired
    private IMatriculaRepository MatriculaRepo;

    @Override
    public void ingresarMatricula(Matricula e) {
        this.MatriculaRepo.insertar(e);
        
    }

    @Override
    public Matricula buscarPorNumero(String numero) {
        // TODO Auto-generated method stub
        return this.MatriculaRepo.buscar(numero);
    }

    @Override
    public void actualizarMatricula(Matricula e) {
        this.MatriculaRepo.actualizar(e);
        
    }

    @Override
    public void borrarMatricula(String numero) {
        this.MatriculaRepo.eliminar(numero);
        
    }




    
}
