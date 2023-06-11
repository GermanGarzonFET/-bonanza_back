package com.bonanza.back.Repository;

import com.bonanza.back.DTO.EstanquesDTO;
import com.bonanza.back.Model.Estanques;
import com.bonanza.back.Model.Lote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EstanquesRepository extends JpaRepository<Estanques, Long> {
    @Query(value = "" +
            "SELECT te.*, u.nombre, u.apellido, u.email, u.perfil, u.telefono FROM tipos_estanques te " +
            "INNER JOIN usuarios u ON te.id_usuario = u.id " +
            "WHERE te.id_usuario = :id_usuario " +
            "", nativeQuery = true)
    List<EstanquesDTO> listar(
            @Param("id_usuario") Integer id_usuario
    );
}
