package com.backit.backit.modelos; 

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idproducto;
    
    @NotEmpty
    private String nombre;
    
    
    private String descripcion;
    
    @NotEmpty
    private Integer precio;
       
    private String img;
}
