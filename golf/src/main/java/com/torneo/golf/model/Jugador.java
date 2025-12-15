package com.torneo.golf.model;

import jakarta.persistence.*;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "jugadores")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellidos;

    @Column(nullable = false)
    private String nacionalidad;

    @Column(nullable = false)
    private Integer handicap;

    @OneToMany(mappedBy = "jugador")
    private Set<Clasificacion> clasificaciones;
    @Column(nullable = false)
    private Integer dineroAcumulado;

    // RELACIÓN MUCHOS A UNO (Con Torneo)
    @ManyToOne
    @JoinColumn(name = "torneo_id")
    private Torneo torneo;



    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "jugadores_etiquetas",
            joinColumns = @JoinColumn(name = "jugador_id"),
            inverseJoinColumns = @JoinColumn(name = "etiqueta_id")
    )
    private Set<Etiqueta> etiquetas = new HashSet<>();


    public Jugador() {
    }

    public Jugador(String nombre, String apellidos, String nacionalidad, Integer handicap, Integer dineroAcumulado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.handicap = handicap;
        this.dineroAcumulado = dineroAcumulado;
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

    public Set<Clasificacion> getClasificaciones() {
        return clasificaciones;
    }

    public void setClasificaciones(Set<Clasificacion> clasificaciones) {
        this.clasificaciones = clasificaciones;
    }

    public Set<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(Set<Etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }
}
