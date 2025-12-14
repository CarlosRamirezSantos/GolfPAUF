package com.torneo.golf.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "clasificaciones")
public class Clasificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer posicion;

    @ManyToOne(optional = false)
    @JoinColumn(name = "jugador_id", nullable = false)
    private Jugador jugador;

    @ManyToOne(optional = false)
    @JoinColumn(name = "torneo_id", nullable = false)
    private Torneo torneo;


    public Clasificacion() {
    }

    public Clasificacion(Integer posicion, Jugador jugador, Torneo torneo) {
        this.posicion = posicion;
        this.jugador = jugador;
        this.torneo = torneo;
    }

    public Long getId() {
        return id;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
