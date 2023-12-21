

package com.example.teste2.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.teste2.model.Mercadoria;
import com.example.teste2.repository.MercadoriaRepository;

@Service
public class MercadoriaService {
    
    @Autowired
    private MercadoriaRepository mercadoriaRepository;

    public Mercadoria Cadastrar( Mercadoria mercadoria){
        return mercadoriaRepository.save(mercadoria);
    }

    public List<Mercadoria> obtertodos(){
        return mercadoriaRepository.findAll();
    }

    public Mercadoria obterPorId(Long id){
        Optional<Mercadoria> optmercadorias = mercadoriaRepository.findById(id);
        if(optmercadorias.isEmpty()){
            throw new IllegalArgumentException("Não existe um mercadoria cadastrado com esse ID");
        }

        return optmercadorias.get();
    }

        public Mercadoria Atualizar(Long id, Mercadoria mercadoria){
        


            mercadoria.setId(id);

            return mercadoriaRepository.save(mercadoria);
    }

    public void Deletar(Long id){
       mercadoriaRepository.deleteById(id);
    }
}
