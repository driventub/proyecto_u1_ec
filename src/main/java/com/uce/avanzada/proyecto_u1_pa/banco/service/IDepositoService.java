package com.uce.avanzada.proyecto_u1_pa.banco.service;

import java.math.BigDecimal;

public interface IDepositoService {
    public void realizar(String ctaDestin, BigDecimal monto );
}
