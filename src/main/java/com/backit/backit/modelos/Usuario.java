
package com.backit.backit.modelos; 

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idusuario;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String contraseña;
    
    @Column
    private int tipocarrito;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimacompra;

    @Column
    private Double acucompras;


    
}
