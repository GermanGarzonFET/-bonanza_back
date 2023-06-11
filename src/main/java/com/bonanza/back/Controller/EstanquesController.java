package com.bonanza.back.Controller;

import com.bonanza.back.DTO.EstanquesDTO;
import com.bonanza.back.DTO.RequestEstanques;
import com.bonanza.back.Model.Estanques;

import com.bonanza.back.Service.EstanquesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estanques")
@CrossOrigin("*")
public class EstanquesController {
    @Autowired
    EstanquesService estanquesService;

    @PostMapping("/listar")
    private List<EstanquesDTO> listarEspecies (@Validated @RequestBody RequestEstanques request){
        Integer usuario = request.getId_usuario();
        return estanquesService.findAll(usuario);
    }

    @PostMapping("/")
    public Estanques guardarEstanques(@Validated @RequestBody Estanques estanques) throws Exception{
        return estanquesService.guardarEstanques(estanques);
    }


}
