
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
    
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idusuario;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String contraseña;
    
    @OneToOne
    @JoinColumn(name="id")
    private List<carrito> tipoCarrito;
    
    private Date ultimaCompra;

    private Double acuCompras;

    
}

