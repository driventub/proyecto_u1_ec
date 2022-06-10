package com.uce.avanzada.proyecto_u1_pa.banco.service;

import java.math.BigDecimal;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.Transferencia;

public interface ITransferenciaService {
    public void realizar(String ctaOrigen, String ctaDestino, BigDecimal monto);

    
    public void ingresarTransferencia(Transferencia e);

    
    public Transferencia buscarPorNumCuenta(String numCuenta);

    
    public void actualizarTransferencia(Transferencia e);

    
    public void borrarTransferencia(String numCuenta);

    // Funcionalidad para realizar retiro

    public void realizarRetiro(String numCuenta, BigDecimal monto);

}
