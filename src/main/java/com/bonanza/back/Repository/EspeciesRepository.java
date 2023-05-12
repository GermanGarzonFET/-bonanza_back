package com.bonanza.back.Repository;

import com.bonanza.back.Model.CentrodeCosto;
import com.bonanza.back.Model.Especies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EspeciesRepository extends JpaRepository<Especies, Long> {

    @Query(value = "" +
            "SELECT * FROM especies e" +
            "", nativeQuery = true)
    List<Especies> listarEspecies();

}
