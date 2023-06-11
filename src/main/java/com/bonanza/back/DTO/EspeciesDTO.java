package com.bonanza.back.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public interface EspeciesDTO {
    Long getId();
    String getNombre_especie();
    Integer getId_usuario();
    String getNombre();
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy", locale = "es-CO", timezone = "America/Bogota")
    Date getFecha_registro();
    String getApellido();
    String getEmail();
    String getPerfil();
    String getTelefono();
}
