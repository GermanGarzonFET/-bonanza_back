package com.bonanza.back.Service;

import com.bonanza.back.Model.Proveedor;
import com.bonanza.back.Model.Usuario;
import com.bonanza.back.Model.UsuarioRol;

import java.util.List;
import java.util.Set;

public interface ProveedorService {
    public List<Proveedor> findAll();

    public Proveedor guardarProveedor(Proveedor proveedor);
    public Proveedor editarProveedor(Proveedor proveedor);
    public void eliminarProveedor(Long proveedorId);
}
