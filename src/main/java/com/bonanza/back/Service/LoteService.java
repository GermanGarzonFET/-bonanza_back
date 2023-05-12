package com.bonanza.back.Service;

import com.bonanza.back.Model.CentrodeCosto;
import com.bonanza.back.Model.Lote;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LoteService {
    public Lote guardarLote(Lote lote);

    public List<Lote> listarLote();

    public void eliminarLote(Long loteId);
}
