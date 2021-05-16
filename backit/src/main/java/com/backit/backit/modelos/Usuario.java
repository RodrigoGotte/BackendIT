
package com.backit.backit.modelos; 

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String contraseña;
    
    @NotEmpty
    private Integer tipoCarrito;
    
    private Date ultimaCompra;

    private Double acuCompras;

    
}

