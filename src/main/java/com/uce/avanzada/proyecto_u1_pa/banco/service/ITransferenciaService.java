package com.uce.avanzada.proyecto_u1_pa.banco.service;

import java.math.BigDecimal;

public interface ITransferenciaService {
    public void realizar(String ctaOrigen, String ctaDestino, BigDecimal monto);

}
