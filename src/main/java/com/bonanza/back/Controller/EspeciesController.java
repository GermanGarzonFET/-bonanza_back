package com.bonanza.back.Controller;

import com.bonanza.back.Model.CentrodeCosto;
import com.bonanza.back.Model.Especies;
import com.bonanza.back.Model.Usuario;
import com.bonanza.back.Service.EspeciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/especies")
@CrossOrigin("*")
public class EspeciesController {

    @Autowired
    EspeciesService especiesService;
    @GetMapping("/listar")
    private ResponseEntity<List<Especies>> getAllEspecies (){
        return ResponseEntity.ok(especiesService.findAll());
    }

    @GetMapping("/listarEspecies")
    private ResponseEntity<List<Especies>> listarEspecies() {
        return ResponseEntity.ok(especiesService.listarEspecies());
    }
}
