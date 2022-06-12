package com.uce.avanzada.proyecto_u1_pa.bodega.service;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.avanzada.proyecto_u1_pa.bodega.modelo.Reporte;

public interface IGestorInventario{
    public List<Reporte> realizarReporte(LocalDateTime fechaInicio);
    
}
