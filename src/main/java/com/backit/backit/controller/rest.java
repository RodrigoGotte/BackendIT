package com.backit.backit.controller;

import com.backit.backit.dao.usuariodao;
import java.util.List;

import com.backit.backit.modelos.Producto;
import com.backit.backit.modelos.Usuario;
import com.backit.backit.service.productoservice;
import com.backit.backit.service.usuarioservice;
import java.io.Console;
import static java.lang.System.console;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Optional;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
        
    @GetMapping("/usu/{nombre}/{contraseña}")
    public Usuario login(@PathVariable("nombre")String nombre, @PathVariable("contraseña")String contraseña )            
    {
        Usuario usuario = usuS.findBynombreAndContraseña(nombre,contraseña);
          
        changeTipe(usuario);
       
        return usuario;
    }
    
    @PutMapping("check")
    public void changeTipe(Usuario usuario)
    {
        long timeNow = Calendar.getInstance().getTimeInMillis();
        long timeProm =Calendar.getInstance().getTimeInMillis();
        
        java.sql.Timestamp tp = new java.sql.Timestamp(timeProm); 
        java.sql.Timestamp ts = new java.sql.Timestamp(timeNow);
       
        if(usuario.getAcucompras() >= 10000)
        {
           usuario.setTipocarrito(1);
        }if (ts == tp)
        {
             usuario.setTipocarrito(3);
        }        
        else
        {
            usuario.setTipocarrito(2);

        }
        usuS.changeType(usuario);
    }
 
    @PutMapping("/compra/{id}/{venta}")
    public void Compra (@PathVariable("id")Long id, @PathVariable("venta")Double venta  )
    {
      long timeNow = Calendar.getInstance().getTimeInMillis();
      java.sql.Timestamp ts = new java.sql.Timestamp(timeNow);
        
       Usuario usuario = usuS.findByidusuario(id);
        usuario.setAcucompras(venta + usuario.getAcucompras());
        usuario.setUltimacompra(ts);
       
        usuS.compra(usuario);
       
    }
    
   @GetMapping("/usu/{nombre}")
    public Usuario prueba(@PathVariable("nombre")Long nombre)            
    {
        Usuario usuario = usuS.findByidusuario(nombre);
                
        return usuario;
    }


 @GetMapping("/prod/{nombre}")
    public Producto encontrarProd(@PathVariable("nombre")Long nombre)            
    {
        Producto producto = prodS.encontrarProducto(nombre);
                
        return producto;
    }
    

}

