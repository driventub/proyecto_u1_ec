package com.uce.avanzada.proyecto_u1_pa.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepoImpl implements ITransferenciaRepo {

    @Override
    public void insertar(Transferencia t) {

        System.out.println("Aqui se inserta la transferencia a la base de datos" + t);

    }

    @Override
    public Transferencia buscar(String numCuenta) {
        System.out.println("Se ha buscado en la base " + numCuenta);
        Transferencia e = new Transferencia();
        e.setNumCuentaDestin(numCuenta);
        return e;
    }

    @Override
    public void actualizar(Transferencia e) {
        System.out.println("Se ha actualizado en la base " + e);

    }

    @Override
    public void eliminar(String numCuenta) {
        System.out.println("Se ha eliminado de la base " + numCuenta);

    }

    @Override
    public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaRetiro) {
        // TODO Auto-generated method stub
        return null;
    }

    

}
