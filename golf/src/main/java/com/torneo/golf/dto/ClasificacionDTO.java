package com.torneo.golf.dto;

public class ClasificacionDTO {

    private Long torneoId;
    private String nombreTorneo;
    private Integer posicion;

    public ClasificacionDTO() {
    }

    public ClasificacionDTO(Long torneoId, String nombreTorneo, Integer posicion) {
        this.torneoId = torneoId;
        this.nombreTorneo = nombreTorneo;
        this.posicion = posicion;
    }

    public Long getTorneoId() {
        return torneoId;
    }

    public void setTorneoId(Long torneoId) {
        this.torneoId = torneoId;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }
}

