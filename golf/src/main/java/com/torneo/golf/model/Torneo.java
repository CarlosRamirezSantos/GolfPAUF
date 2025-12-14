package com.torneo.golf.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "torneos")
public class Torneo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String lugar;

    @Column(nullable = false)
    private LocalDate fechaInicio;

    @Column(nullable = false)
    private LocalDate fechaFin;

    @Column(nullable = false)
    private Double premioTotal;

    @OneToMany(mappedBy = "torneo")
    private Set<Clasificacion> clasificaciones;

    public Torneo() {
    }

    public Torneo(String nombre, String lugar, LocalDate fechaInicio, LocalDate fechaFin, Double premioTotal) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.premioTotal = premioTotal;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Set<Clasificacion> getClasificaciones() {
        return clasificaciones;
    }

    public void setClasificaciones(Set<Clasificacion> clasificaciones) {
        this.clasificaciones = clasificaciones;
    }
}