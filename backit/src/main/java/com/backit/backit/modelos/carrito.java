package com.backit.backit.modelos;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

@Entity
@Data
@Table(name="carrito")
public class carrito implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotEmpty
    private String tipo;

    public void add(SimpleGrantedAuthority simpleGrantedAuthority) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


