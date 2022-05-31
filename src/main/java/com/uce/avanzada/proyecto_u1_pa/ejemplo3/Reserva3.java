package com.uce.avanzada.proyecto_u1_pa.ejemplo3;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Reserva3 {
    
    
    private Carro carro;

    private BigDecimal costo;
    private LocalDateTime fechaReserva;

    public String  agendarReserva(String modelo, String marca, String placa, BigDecimal costo, LocalDateTime fechaReserva) {
        this.carro.setMarca(marca);
        this.carro.setModelo(modelo);
        this.carro.setPlaca(placa);

        this.costo = costo;
        this.fechaReserva = fechaReserva;

        return "Reserva setters agendada!";
    }

    // Set y GEt

    public Carro getCarro() {
        return carro;
    }

    @Autowired
    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public BigDecimal getCosto() {
        return costo;
    }

    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    
}
