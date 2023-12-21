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

import com.example.teste2.model.Familia;
import com.example.teste2.service.FamiliaService;

@RestController
@RequestMapping("api/familia")
@CrossOrigin("*")

public class FamiliaController {
    @Autowired
    private FamiliaService familiaService;
  
    
    @GetMapping
    public List <Familia> obtertodos(){
        
        return familiaService.obtertodos();
    }


    @GetMapping("/{id}")
    public Familia obterPorId(@PathVariable Long id){

        return familiaService.obterPorId(id);

    }


   @PostMapping 
public Familia Cadastrar(@RequestBody Familia familia){

    return familiaService.Cadastrar(familia);
}


   @PutMapping ("/{id}")
public Familia Atualizar(@PathVariable Long id, @RequestBody Familia familia){

    return familiaService.Atualizar(id, familia);
}

@DeleteMapping("/{id}")
public void Deletar(@PathVariable Long id){
  familiaService.Deletar(id);

}
}
