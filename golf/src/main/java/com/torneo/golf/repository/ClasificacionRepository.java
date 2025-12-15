package com.torneo.golf.repository;

import com.torneo.golf.model.Clasificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClasificacionRepository extends JpaRepository<Clasificacion, Long> {


    Clasificacion findByJugadorIdAndTorneoId(Long jugadorId, Long torneoId);


    @Query(value = "SELECT j.id, j.nombre, j.apellidos, j.handicap, c.posicion, t.nombre " +
            "FROM clasificaciones c " +
            "JOIN jugadores j ON c.jugador_id = j.id " +
            "JOIN torneos t ON c.torneo_id = t.id " +
            "WHERE c.torneo_id = :idTorneo AND c.posicion = 1",
            nativeQuery = true)
    List<Object[]> encontrarGanadorPorTorneo(@Param("idTorneo") Long idTorneo);
}