package com.example.teste2.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teste2.model.Usuario;
import com.example.teste2.repository.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario Cadastrar( Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> obtertodos(){
        return usuarioRepository.findAll();
    }

    public Usuario obterPorId(Long id){
        Optional<Usuario> optusuario = usuarioRepository.findById(id);
        if(optusuario.isEmpty()){
            throw new IllegalArgumentException("usuario não existente cadastrado com esse ID");
        }

        return optusuario.get();
    }

        public Usuario Atualizar(Long id, Usuario usuario){
        


            usuario.setId(id);

            return usuarioRepository.save(usuario);
    }

    public void Deletar(Long id){
        usuarioRepository.deleteById(id);
    }
}
