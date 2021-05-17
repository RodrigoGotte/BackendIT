package com.backit.backit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

import com.backit.backit.dao.usuariodao;
import com.backit.backit.modelos.Usuario; 
import com.backit.backit.modelos.carrito;
import java.util.Collection;
import org.springframework.security.core.authority.SimpleGrantedAuthority;


@Service("userDetailsService")
@Slf4j
public class usuarioservice implements UserDetailsService{

    @Autowired
    private usuariodao usuariodao;
    
    @Override    
    public UserDetails loadUserByUsername(String nombre) throws UsernameNotFoundException {
        Usuario usuario = usuariodao.findByUsername(nombre);

        if(usuario == null){
            throw new UsernameNotFoundException(nombre);
        }
        
        var carrs = new ArrayList<GrantedAuthority>(); 
        
        for(carrito car: usuario.getTipoCarrito()){
            carrs.add(new SimpleGrantedAuthority(car.getTipo()));
        }
           return new User(usuario.getNombre(), usuario.getContraseña(),carrs);

     
    }
          
        
}
