package com.uce.avanzada.proyecto_u1_pa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.avanzada.proyecto_u1_pa.modelo.Materia;
import com.uce.avanzada.proyecto_u1_pa.repository.IMateriaRepository;

@Service
public class MateriaServiceImpl implements IMateriaService{


    @Autowired
    private IMateriaRepository MateriaRepo;

    
    


    @Override
    public void ingresarMateria(Materia e) {
        
        this.MateriaRepo.insertar(e);
        
    }

    @Override
    public Materia buscarPorSemestre(String semestre) {
        // TODO Auto-generated method stub
        return this.MateriaRepo.buscar(semestre);
    }

    @Override
    public void actualizarMateria(Materia e) {
        this.MateriaRepo.actualizar(e);
        
    }

    @Override
    public void borrarMateria(String cedula) {
        this.MateriaRepo.eliminar(cedula);
        
    }




    
}
