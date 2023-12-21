

package com.example.teste2.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.teste2.model.Endereco;
import com.example.teste2.repository.EnderecoRepository;

@Service
public class EnderecoService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco Cadastrar( Endereco endereco){
        return enderecoRepository.save(endereco);
    }

    public List<Endereco> obtertodos(){
        return enderecoRepository.findAll();
    }

    public Endereco obterPorId(Long id){
        Optional<Endereco> optenderecos = enderecoRepository.findById(id);
        if(optenderecos.isEmpty()){
            throw new IllegalArgumentException("Não existe um endereco cadastrado com esse ID");
        }

        return optenderecos.get();
    }

        public Endereco Atualizar(Long id, Endereco endereco){
        


            endereco.setId(id);

            return enderecoRepository.save(endereco);
    }

    public void Deletar(Long id){
       enderecoRepository.deleteById(id);
    }
}
