package com.backit.backit.service;

import java.util.List;

import com.backit.backit.dao.productodao;
import com.backit.backit.dao.usuariodao;
import com.backit.backit.modelos.Producto;
import com.backit.backit.modelos.Usuario;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;


@Service
public class impusuario implements usuarioservice {

    @Autowired
    private usuariodao dao;
    
    @Override
    public Usuario findBynombreAndContraseña(String nombre,String contraseña) {
        return this.dao.findBynombreAndContraseña(nombre,contraseña);
    }

    @Override
    public Usuario changeType(Usuario usuario) {
        return this.dao.save(usuario);
    }

    @Override
    public Usuario findByidusuario(Long id) {
        return this.dao.findByidusuario(id);
       
    }

    @Override
    public Usuario compra(Usuario usuario) {
         return this.dao.save(usuario);
    }
 

    

   
}
