package com.uce.avanzada.proyecto_u1_pa.banco.repository;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Transferencia;

public interface ITransferenciaRepo {
    public void insertar(Transferencia t);

    public Transferencia buscar(String apellido);

    public void actualizar(Transferencia e);

    public void eliminar(String cedula);

}
