package com.example.teste2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teste2.model.Mercadoria;


public interface MercadoriaRepository extends JpaRepository <Mercadoria,Long>{
    
}
