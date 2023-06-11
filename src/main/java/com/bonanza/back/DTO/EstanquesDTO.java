package com.bonanza.back.DTO;

import java.time.LocalDateTime;
import java.util.Date;

public interface EstanquesDTO {
    Long getId();
    String getNombre_estanque();
    String getUso();
    String getConsecutivo();
    String getDensidad_siembra();
    String getMedicion();
    String getGeolocation();
    String getEvidencia_fotografica();
    Integer getId_usuario();
    String getNombre();
    Date getFecha_registro();
    String getApellido();
    String getEmail();
    String getPerfil();
    String getTelefono();
}
