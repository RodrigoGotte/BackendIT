package com.backit.backit.service;

import java.util.List;
import com.backit.backit.modelos.Producto;


public interface productoservice  {

    public List<Producto> listarProductos();
    public Producto encontrarProducto(Long id);
}
    

