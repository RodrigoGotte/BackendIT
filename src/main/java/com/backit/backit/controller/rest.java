package com.backit.backit.controller;

import com.backit.backit.dao.usuariodao;
import java.util.List;

import com.backit.backit.modelos.Producto;
import com.backit.backit.modelos.Usuario;
import com.backit.backit.service.productoservice;
import com.backit.backit.service.usuarioservice;
import java.util.Optional;
import javax.websocket.server.PathParam;

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
    
/*    @PostMapping("sold/{idusuario}/{precio}") 
    public void Comprar(@PathParam("idusuario") Long idusuario, @PathParam("precio") double precio )
    {
        se trabaja con usuarioservice
        
    }
*/
    
    @GetMapping("/usu/{nombre}/{contraseña}")
    public Usuario login(@PathParam("nombre") String nombre, @PathParam("contraseña") String contraseña )            
    {
        return null;
    }
    
   /* @PostMapping("check")
    public void changeTipe(Long id)
    {
    }*/
    
/*  
   @GetMapping("usu/{id}")
    public Usuario encontrarUsuario( @PathParam("id") Long id )
    {
   
        Usuario usuario = usuS.getOne(id);
        return usuario;
    }
*/
}

