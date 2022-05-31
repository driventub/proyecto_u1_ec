package com.uce.avanzada.proyecto_u1_pa.ejemplo2;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class Cajero2 {
    
    
    private Cliente cliente;

    
    private Comida comida;

    private BigDecimal total;

    

    public Cajero2(Cliente cliente, Comida comida) {
        this.cliente = cliente;
        this.comida = comida;
    }



    public String  realizarOrden(String nombre, String cedula, String tarjetaCredito, String nombreComida, BigDecimal precio, Boolean promocion) {
        this.cliente.setCedula(cedula);
        this.cliente.setNombre(nombre);
        this.cliente.setTarjetaCredito(tarjetaCredito);
        
        this.comida.setNombre(nombreComida);
        this.comida.setPrecio(precio);
        this.comida.setPromocion(promocion);
        
        this.total =precio.add(precio.multiply(new BigDecimal("0.12")));
        
        return "Orden constructor generada";
    }

    // Set y Get

    public Cliente getCliente() {
        return cliente;
    }



    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



    public Comida getComida() {
        return comida;
    }



    public void setComida(Comida comida) {
        this.comida = comida;
    }



    public BigDecimal getTotal() {
        return total;
    }



    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    
}
