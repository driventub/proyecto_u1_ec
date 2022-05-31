package com.uce.avanzada.proyecto_u1_pa.consultorio;

import java.time.LocalDateTime;


import org.springframework.stereotype.Service;

@Service
public class CitaMedica {
    
    private LocalDateTime fechaCita;

    
    
    private Doctor doctor;
    private Paciente paciente;

    // 2. DI por constructor
    public CitaMedica(Doctor doctor, Paciente paciente) {
        this.doctor  = doctor;
        this.paciente = paciente;
    }

    public String  agendar(LocalDateTime fechaCita, String nombre, String apellido, Integer edad, String ciudad, String nombrePaciente, Integer edadPaciente) {
        // ///////////////////////////
        // this.doctor = new Doctor();
        // this.paciente = new Paciente();
        // ///////////////////////////

        this.doctor.setNombre(nombre);
        this.doctor.setApellido(apellido);
        this.doctor.setEdad(edad);
        this.doctor.setCiudad(ciudad);

        this.paciente.setEdad(edadPaciente);
        this.paciente.setNombre(nombrePaciente);

        // Seteamos los atributos los atributos de la cita medica
        this.fechaCita = fechaCita;

        return "Cita agendada";
        
    }

    // Set y Get
    public Doctor getDoctor() {
        return this.doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getFechaCita() {
        return this.fechaCita;
    }

    public void setFechaCita(LocalDateTime fechaCita) {
        this.fechaCita = fechaCita;
    }

}
