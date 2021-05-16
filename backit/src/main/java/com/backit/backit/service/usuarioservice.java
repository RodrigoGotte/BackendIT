package com.backit.backit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;



import com.backit.backit.dao.usuariodao;
import com.backit.backit.modelos.Usuario; 


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

        return new User(usuario.getnombre(), usuario.getcontraseña());
    }
    
}
