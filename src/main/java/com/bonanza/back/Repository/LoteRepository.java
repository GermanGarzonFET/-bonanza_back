package com.bonanza.back.Repository;


import com.bonanza.back.Model.Especies;
import com.bonanza.back.Model.Lote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LoteRepository extends JpaRepository<Lote, Long> {
    @Query(value = "" +
            "SELECT * FROM lote l" +
            "", nativeQuery = true)
    List<Lote> listarLote();
}
