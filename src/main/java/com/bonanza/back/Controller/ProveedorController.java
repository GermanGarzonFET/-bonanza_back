package com.bonanza.back.Controller;

import com.bonanza.back.Model.Proveedor;
import com.bonanza.back.Service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedor")
@CrossOrigin("*")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @GetMapping("/listar")
    private ResponseEntity<List<Proveedor>> findAll() {
        return ResponseEntity.ok(proveedorService.findAll());
    }

    @PostMapping("/")
    public Proveedor guardarProveedor(@RequestBody Proveedor proveedor) throws Exception{

        return proveedorService.guardarProveedor(proveedor);
    }

    @DeleteMapping("/eliminar/{proveedorId}")
    public void eliminarProveedor(@PathVariable("proveedorId") Long proveedorId){
        proveedorService.eliminarProveedor(proveedorId);
    }

    @PutMapping("/editar")
    public Proveedor editarProveedor(@RequestBody Proveedor proveedor) throws Exception{

        return proveedorService.editarProveedor(proveedor);
    }
}
