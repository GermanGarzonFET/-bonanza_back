package com.bonanza.back.Service;

import com.bonanza.back.Model.CentrodeCosto;
import com.bonanza.back.Model.Proveedor;

import java.util.List;

public interface CentrodeCostoService {

    public CentrodeCosto guardarCentrodeCosto(CentrodeCosto centrodeCosto);

    public List<CentrodeCosto> listarCentrodeCosto();

    public void eliminarCentrodeCosto(Long centrodecostoId);
}
