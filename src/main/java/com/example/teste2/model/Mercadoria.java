package com.example.teste2.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mercadoria {
   
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY) 
 @Column(name = "id_mercadoria")  
private Long id;

@Column(nullable = false)
private String descricao;

@Column(nullable = false)
private double valor;

@Column(nullable = false)
private String familia;



public String getFamilia() {
    return familia;
}

public void setFamilia(String familia) {
    this.familia = familia;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

public double getValor() {
    return valor;
}

public void setValor(double valor) {
    this.valor = valor;
}



}
