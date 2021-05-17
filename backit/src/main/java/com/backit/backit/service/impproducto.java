package com.backit.backit.service;

import java.util.List;

import com.backit.backit.dao.productodao;
import com.backit.backit.modelos.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class impproducto implements productoservice {

    @Autowired
    private productodao dao;

    @Override
    public List<Producto> listarProductos() {
              return (List<Producto>) dao.findAll();
    }

    @Override
    public Producto encontrarProducto(Producto producto) {
        
        return dao.findById(producto.getIdproducto()).orElse(null);
    }
    
}
