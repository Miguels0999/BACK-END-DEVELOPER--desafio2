package com.example.teste2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teste2.model.Mercadoria;
import com.example.teste2.service.MercadoriaService;

@RestController
@RequestMapping("api/mercadoria")
@CrossOrigin("*")
public class MercadoriaController {
    @Autowired
    private MercadoriaService mercadoriaService;
  
    
    @GetMapping
    public List <Mercadoria> obtertodos(){
        
        return mercadoriaService.obtertodos();
    }


    @GetMapping("/{id}")
    public Mercadoria obterPorId(@PathVariable Long id){

        return mercadoriaService.obterPorId(id);

    }


   @PostMapping 
public Mercadoria Cadastrar(@RequestBody Mercadoria mercadoria){

    return mercadoriaService.Cadastrar(mercadoria);
}


   @PutMapping ("/{id}")
public Mercadoria Atualizar(@PathVariable Long id, @RequestBody Mercadoria mercadoria){

    return mercadoriaService.Atualizar(id, mercadoria);
}

@DeleteMapping("/{id}")
public void Deletar(@PathVariable Long id){
  mercadoriaService.Deletar(id);

}
}
