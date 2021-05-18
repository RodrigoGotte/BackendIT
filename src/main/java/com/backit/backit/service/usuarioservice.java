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



public interface usuarioservice /*implements UserDetailsService*/{
    
      
    
}
