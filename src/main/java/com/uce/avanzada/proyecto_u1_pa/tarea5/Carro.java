package com.uce.avanzada.proyecto_u1_pa.tarea5;

import org.springframework.stereotype.Component;

@Component
public class Carro {
    private String modelo;
    private String marca;
    private String placa;
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
}
