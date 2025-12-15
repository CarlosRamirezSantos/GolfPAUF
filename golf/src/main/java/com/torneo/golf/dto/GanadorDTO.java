package com.torneo.golf.dto;

public class GanadorDTO {
    private String nombre;
    private String apellidos;
    private Integer handicap;
    private Integer posicion;
    private String nombreTorneo;

    public GanadorDTO() {
    }

    public GanadorDTO(String nombre, String apellidos, Integer handicap, Integer posicion, String nombreTorneo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.handicap = handicap;
        this.posicion = posicion;
        this.nombreTorneo = nombreTorneo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getHandicap() {
        return handicap;
    }

    public void setHandicap(Integer handicap) {
        this.handicap = handicap;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }
}