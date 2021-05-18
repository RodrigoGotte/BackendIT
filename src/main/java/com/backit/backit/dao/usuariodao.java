package com.backit.backit.dao;
import com.backit.backit.modelos.Usuario;
import java.util.Optional;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface usuariodao extends JpaRepository<Usuario, Long>{

    
    Usuario findBynombreAndContraseña(String nombre,String contraseña);
 //   @Query(value="SELECT * FROM USUARIO WHERE NOMBRE=':nombre' && CONTRASEÑA=':contraseña'",nativeQuery=true)
   // Usuario login(String nombre, String contraseña);
   
  //   Usuario findByUsername(String nombre);

    public Usuario findByidusuario(Long id);
}






