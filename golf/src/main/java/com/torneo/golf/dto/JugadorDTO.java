package com.torneo.golf.dto;

import java.util.List;

public class JugadorDTO {

    private Long id;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private Integer handicap;

    private List<ClasificacionDTO> clasificaciones;

    public JugadorDTO() {
    }

    public JugadorDTO(Long id, String nombre, String apellidos,
                      String nacionalidad, Integer handicap,
                      List<ClasificacionDTO> clasificaciones) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.handicap = handicap;
        this.clasificaciones = clasificaciones;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Integer getHandicap() {
        return handicap;
    }

    public void setHandicap(Integer handicap) {
        this.handicap = handicap;
    }

    public List<ClasificacionDTO> getClasificaciones() {
        return clasificaciones;
    }

    public void setClasificaciones(List<ClasificacionDTO> clasificaciones) {
        this.clasificaciones = clasificaciones;
    }
}
