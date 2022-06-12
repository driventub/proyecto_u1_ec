package com.uce.avanzada.proyecto_u1_pa.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.avanzada.proyecto_u1_pa.bodega.modelo.Inventario;
import com.uce.avanzada.proyecto_u1_pa.bodega.modelo.Reporte;

@Service
public class GestorInventarioImpl implements IGestorInventario{

    @Autowired
    private IInventarioService inventarioService;

    @Override
    public List<Reporte> realizarReporte(LocalDateTime fechaInicio) {
        List<Inventario> listaInventario = this.inventarioService.buscarTodos();

        List<Reporte> listaReporte = new ArrayList<>();
        for (Inventario inventario : listaInventario) {
            // para que imprima desde una fecha establecida
            if(fechaInicio.isBefore(inventario.getFechaIngreso())){
                BigDecimal pc =  inventario.getProducto().getPrecio();
                BigDecimal g = pc.multiply(new BigDecimal("0.1"));
                BigDecimal iva = pc.multiply(new BigDecimal("0.12"));
                BigDecimal pv = pc.add(g).add(iva);
                Reporte r = transformar(inventario);
                r.setPrecioVenta(pv);

                listaReporte.add(r);
                
            }
        }

        for (Reporte r : listaReporte) {
            System.out.println(r.toString());
        }
        return listaReporte;
    }

    private Reporte transformar(Inventario i){
        Reporte r = new Reporte();
        r.setCantidadProducto(i.getCantidad());
        r.setFechaIngreso(i.getFechaIngreso());
        r.setNombreProducto(i.getProducto().getNombre());
        

        return r;

    }
   
    
}
