package com.uce.avanzada.proyecto_u1_pa.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepoImpl implements ITransferenciaRepo {

    @Override
    public void insertar(Transferencia t) {
        
        System.out.println("Aqui se inserta la transferencia a la base de datos");
        
    }
    
}
