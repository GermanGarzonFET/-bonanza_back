package com.bonanza.back.Model;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "Inventario_Alimentos")
public class InventarioAlimentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private String tipo_alimento;
    private String proveedor;
    private String registro_ica;
    private String numero_factura;
    private Integer numero_kilos;
    private  Date fecha_vencimiento;
}
