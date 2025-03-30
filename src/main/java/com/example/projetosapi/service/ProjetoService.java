package com.example.projetosapi.service;

import com.example.projetosapi.exception.RecursoNaoEncontradoException;
import com.example.projetosapi.model.Projeto;
import com.example.projetosapi.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {
    
    @Autowired
    private ProjetoRepository projetoRepository;
    
    public List<Projeto> listarTodos() {
        return projetoRepository.findAll();
    }
    
    public Projeto buscarPorId(Long id) {
        return projetoRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Projeto não encontrado com ID: " + id));
    }
    
    public Projeto salvar(Projeto projeto) {
        return projetoRepository.save(projeto);
    }
    
    public void deletar(Long id) {
        if (!projetoRepository.existsById(id)) {
            throw new RecursoNaoEncontradoException("Projeto não encontrado com ID: " + id);
        }
        projetoRepository.deleteById(id);
    }
}