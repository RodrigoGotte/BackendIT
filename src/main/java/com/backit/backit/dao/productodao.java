package com.backit.backit.dao;
import com.backit.backit.modelos.Producto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface productodao extends JpaRepository<Producto, Long>{
     public Producto findByidproducto(Long id);
}




