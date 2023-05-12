package com.bonanza.back.Service.Implement;

import com.bonanza.back.Model.CentrodeCosto;
import com.bonanza.back.Model.Lote;
import com.bonanza.back.Repository.CentrodeCostoRepository;
import com.bonanza.back.Repository.LoteRepository;
import com.bonanza.back.Service.LoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoteServiceImpl implements LoteService {
    @Autowired
    LoteRepository loteRepository;
    public Lote guardarLote(Lote lote) {
        return loteRepository.save(lote);
    }
    public List<Lote> listarLote() {
        return loteRepository.listarLote();
    }

    @Override
    public void eliminarLote(Long loteId) {
        loteRepository.deleteById(loteId);
    }
}
