package com.torneo.golf.dto;

import java.time.LocalDate;


public class TorneoDTO {

    private Long id;
    private String nombre;
    private String lugar;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double premioTotal;


    public TorneoDTO() {
    }

    public TorneoDTO(Long id, String nombre, String lugar,
                     LocalDate fechaInicio, LocalDate fechaFin,
                     Double premioTotal
                     ) {
        this.id = id;
        this.nombre = nombre;
        this.lugar = lugar;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.premioTotal = premioTotal;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getPremioTotal() {
        return premioTotal;
    }

    public void setPremioTotal(Double premioTotal) {
        this.premioTotal = premioTotal;
    }

}
