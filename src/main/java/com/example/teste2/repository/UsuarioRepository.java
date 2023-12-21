package com.example.teste2.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.teste2.model.Usuario;




public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

}