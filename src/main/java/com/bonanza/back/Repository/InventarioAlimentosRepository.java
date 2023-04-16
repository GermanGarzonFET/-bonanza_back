package com.bonanza.back.Repository;

import com.bonanza.back.Model.InventarioAlimentos;
import com.bonanza.back.DTO.TipoAlimentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface InventarioAlimentosRepository extends JpaRepository<InventarioAlimentos,Long> {
    @Query(value = "" +
            "SELECT s.id, s.tipo_alimento, s.fechaRegistro FROM tipo_alimentos s" +
            "", nativeQuery = true)
    List<TipoAlimentos> tiposAlimentos();
}
