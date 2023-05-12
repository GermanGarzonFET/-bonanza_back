package com.bonanza.back.Service.Implement;

import com.bonanza.back.Model.Proveedor;
import com.bonanza.back.Model.Usuario;
import com.bonanza.back.Model.UsuarioRol;
import com.bonanza.back.Repository.ProveedorRepository;
import com.bonanza.back.Repository.UsuarioRepository;
import com.bonanza.back.Service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    public List<Proveedor> findAll() {
        return proveedorRepository.findAll();
    }

    public Proveedor guardarProveedor(Proveedor proveedor) {
         return proveedorRepository.save(proveedor);
    }

    @Override
    public Proveedor editarProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);

    }

    @Override
    public void eliminarProveedor(Long proveedorId) {
        proveedorRepository.deleteById(proveedorId);
    }
}
