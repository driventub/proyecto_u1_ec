package com.uce.avanzada.proyecto_u1_pa.tarea5;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class Reserva2 {
    
    
    private Carro carro;

    private BigDecimal costo;
    private LocalDateTime fechaReserva;

    

    public Reserva2(Carro carro) {
        this.carro = carro;
    }

    public String  agendarReserva(String modelo, String marca, String placa, BigDecimal costo, LocalDateTime fechaReserva) {
        this.carro.setMarca(marca);
        this.carro.setModelo(modelo);
        this.carro.setPlaca(placa);

        this.costo = costo;
        this.fechaReserva = fechaReserva;

        return "Reserva constructor agendada!";
    }

    // Set y Get

    public Carro getCarro() {
        return carro;
    }

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
