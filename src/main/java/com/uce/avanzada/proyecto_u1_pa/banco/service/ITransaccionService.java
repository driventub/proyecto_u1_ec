package com.uce.avanzada.proyecto_u1_pa.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.avanzada.proyecto_u1_pa.banco.modelo.to.TransaccionTo;

public interface ITransaccionService {
    public void transferencia(String origen, String destino, BigDecimal monto);
    public void deposito(String destino, BigDecimal monto);
    public void retiro(String origen, BigDecimal monto);
    public List<TransaccionTo> consultar(String cuenta, LocalDateTime fechaIncio, LocalDateTime fechaFin);
}
