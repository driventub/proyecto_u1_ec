package com.uce.avanzada.proyecto_u1_pa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.avanzada.proyecto_u1_pa.modelo.Estudiante;
import com.uce.avanzada.proyecto_u1_pa.repository.IEstudianteRepository;

@Service
public class EstudianteServiceImpl implements IEstudianteService{


    @Autowired
    private IEstudianteRepository estudianteRepo;

    @Override
    public void ingresarEstudiante(Estudiante e) {
        this.estudianteRepo.insertar(e);
        
    }

    @Override
    public Estudiante buscarPorApellido(String apellido) {
        // TODO Auto-generated method stub
        return this.estudianteRepo.buscar(apellido);
    }

    @Override
    public void actualizarEstudiante(Estudiante e) {
        this.estudianteRepo.actualizar(e);
        
    }

    @Override
    public void borrarEstudiante(String cedula) {
        this.estudianteRepo.eliminar(cedula);
        
    }




    
}
