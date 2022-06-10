package com.uce.avanzada.proyecto_u1_pa.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Deposito;

@Repository
public class DepositoRepoImpl implements IDepositoRepo{

    @Override
    public void insertarDeposito(Deposito d) {
        System.out.println("Se creo el deposito :" + d);
        
    }

    @Override
    public Deposito buscar(String numCuenta) {
        System.out.println("Se ha buscado en la base " + numCuenta);
        Deposito e = new Deposito();
        e.setNumCuenta(numCuenta);
        return e;
    }

    @Override
    public void actualizar(Deposito e) {
        System.out.println("Se ha actualizado en la base " + e);
        
    }

    @Override
    public void eliminar(String numCuenta) {
        System.out.println("Se ha eliminado de la base " + numCuenta);
        
    }

    
    
}
