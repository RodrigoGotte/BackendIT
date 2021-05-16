package com.backit.backit.controller;

import java.util.List;

import com.backit.backit.modelos.Producto;
import com.backit.backit.service.productoservice;
import com.backit.backit.service.usuarioservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class rest {

    @Autowired
    private productoservice prodS;
    
    @Autowired
    private usuarioservice usuS;

    @GetMapping("/")
    public List<Producto>listar()
    {
        return prodS.listarProductos();
    }

    @GetMapping("prod/{idproducto}")
    public Producto busca(Producto prod)
    {
        return prodS.encontrarProducto(prod);
         
    }

}

