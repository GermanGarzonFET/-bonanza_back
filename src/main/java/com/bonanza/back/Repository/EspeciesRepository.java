package com.bonanza.back.Repository;

import com.bonanza.back.DTO.EspeciesDTO;
import com.bonanza.back.Model.Especies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EspeciesRepository extends JpaRepository<Especies, Long> {

    @Query(value = "" +
            "SELECT te.*, u.nombre, u.apellido, u.email, u.perfil, u.telefono FROM especies te " +
            "INNER JOIN usuarios u ON te.id_usuario = u.id " +
            "WHERE te.id_usuario = :id_usuario " +
            "", nativeQuery = true)
    List<EspeciesDTO> listarEspecies(
            @Param("id_usuario") Integer id_usuario
    );

}
