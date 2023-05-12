package com.bonanza.back.Repository;

import com.bonanza.back.DTO.TipoAlimentos;
import com.bonanza.back.Model.CentrodeCosto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CentrodeCostoRepository extends JpaRepository<CentrodeCosto, Long> {
    @Query(value = "" +
            "SELECT * FROM centrodecosto c" +
            "", nativeQuery = true)
    List<CentrodeCosto> listarCentrodeCosto();
}
