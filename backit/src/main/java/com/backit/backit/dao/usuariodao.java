package com.backit.backit.dao;
import com.backit.backit.modelos.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface usuariodao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String nombre);
}






