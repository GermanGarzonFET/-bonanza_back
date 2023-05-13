package com.bonanza.back.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "lote")
public class Lote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private Date fecha_siembra;
    private String proveedor;
    private String densidad_siembra;
    private Integer numero_animales;
    private String centro_costo;

}
