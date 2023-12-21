

package com.example.teste2.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.teste2.model.Familia;
import com.example.teste2.repository.FamiliaRepository;

@Service
public class FamiliaService {
    
    @Autowired
    private FamiliaRepository familiaRepository;

    public Familia Cadastrar( Familia familia){
        return familiaRepository.save(familia);
    }

    public List<Familia> obtertodos(){
        return familiaRepository.findAll();
    }

    public Familia obterPorId(Long id){
        Optional<Familia> optfamilias = familiaRepository.findById(id);
        if(optfamilias.isEmpty()){
            throw new IllegalArgumentException("Não existe um familia cadastrado com esse ID");
        }

        return optfamilias.get();
    }

        public Familia Atualizar(Long id, Familia familia){
        


            familia.setId(id);

            return familiaRepository.save(familia);
    }

    public void Deletar(Long id){
       familiaRepository.deleteById(id);
    }
}
