package com.uce.avanzada.proyecto_u1_pa.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Deposito;

@Repository
public class DepositoRepoImpl implements IDepositoRepo{

    @Override
    public void insertarDeposito(Deposito d) {
        System.out.println("Se creo el deposito :" + d);
        
    }
    
}
