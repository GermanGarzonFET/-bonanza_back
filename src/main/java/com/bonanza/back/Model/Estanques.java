package com.bonanza.back.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tipos_estanques")
public class Estanques {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre_estanque;
    private String uso;
    private String consecutivo;
    private String densidad_siembra;
    private String medicion;
    private String geolocation;
    private String evidencia_fotografica;
    private Integer id_usuario;
    private LocalDateTime fecha_registro;

    public LocalDateTime getFechaRegistro() {
        return fecha_registro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fecha_registro = fechaRegistro;
    }

    @PrePersist
    public void asignarFechaRegistro() {
        fecha_registro = LocalDateTime.now();
    }

}
