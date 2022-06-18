package com.uce.avanzada.proyecto_u1_pa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.avanzada.proyecto_u1_pa.modelo.Matricula;
import com.uce.avanzada.proyecto_u1_pa.modelo.ProfesorGeneral;
import com.uce.avanzada.proyecto_u1_pa.modelo.ProfesorMateria;
import com.uce.avanzada.proyecto_u1_pa.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService{


    @Autowired
    private IMatriculaRepository MatriculaRepo;

    @Autowired
    private ProfesorGeneral profesorGeneral;
    @Autowired
    private ProfesorMateria profesorMateria;

    // @Lookup
    public ProfesorMateria obtenerProfesorM() {
        ProfesorMateria profesorMateria = new ProfesorMateria();
        profesorMateria.setApelldo("Tapia");
        profesorMateria.setNombre("Jose");
        System.out.println("rrrrrrrrrrrrrrrrr");
        return profesorMateria;
    }
   
    @Lookup
    public ProfesorGeneral obtenerProfesorG() {
        ProfesorGeneral profesorMateria = new ProfesorGeneral();
        profesorMateria.setApelldo("Salcedo");
        profesorMateria.setNombre("Hernando");
        System.out.println("rrrrrrrrrrrrrrrrr");
        return profesorMateria;
    }

    @Override
    public void ingresarMatricula(Matricula e) {
       

        System.out.println("DI un metodo general" + this.obtenerProfesorG());
        System.out.println("DI un metodo Materia" + this.obtenerProfesorM());
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
