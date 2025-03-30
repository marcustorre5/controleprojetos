package com.example.projetosapi.service;

import com.example.projetosapi.exception.RecursoNaoEncontradoException;
import com.example.projetosapi.model.ComponenteEletrico;
import com.example.projetosapi.repository.ComponenteEletricoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponenteEletricoService {
    
    @Autowired
    private ComponenteEletricoRepository componenteRepository;
    
    public List<ComponenteEletrico> listarTodos() {
        return componenteRepository.findAll();
    }
    
    public ComponenteEletrico buscarPorId(Long id) {
        return componenteRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Componente elétrico não encontrado com ID: " + id));
    }
    
    public ComponenteEletrico salvar(ComponenteEletrico componente) {
        return componenteRepository.save(componente);
    }
    
    public void deletar(Long id) {
        if (!componenteRepository.existsById(id)) {
            throw new RecursoNaoEncontradoException("Componente elétrico não encontrado com ID: " + id);
        }
        componenteRepository.deleteById(id);
    }
}