package com.example.projetosapi.service;

import com.example.projetosapi.exception.RecursoNaoEncontradoException;
import com.example.projetosapi.model.ComponenteHidrossanitario;
import com.example.projetosapi.repository.ComponenteHidrossanitarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComponenteHidrossanitarioService {
    
    @Autowired
    private ComponenteHidrossanitarioRepository componenteRepository;
    
    public List<ComponenteHidrossanitario> listarTodos() {
        return componenteRepository.findAll();
    }
    
    public ComponenteHidrossanitario buscarPorId(Long id) {
        return componenteRepository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Componente hidrossanitário não encontrado com ID: " + id));
    }
    
    public ComponenteHidrossanitario salvar(ComponenteHidrossanitario componente) {
        return componenteRepository.save(componente);
    }
    
    public void deletar(Long id) {
        if (!componenteRepository.existsById(id)) {
            throw new RecursoNaoEncontradoException("Componente hidrossanitário não encontrado com ID: " + id);
        }
        componenteRepository.deleteById(id);
    }
}