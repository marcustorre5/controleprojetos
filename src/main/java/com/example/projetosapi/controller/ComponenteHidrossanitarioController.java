package com.example.projetosapi.controller;

import com.example.projetosapi.model.ComponenteHidrossanitario;
import com.example.projetosapi.service.ComponenteHidrossanitarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/componentes/hidrossanitarios")
public class ComponenteHidrossanitarioController {
    
    @Autowired
    private ComponenteHidrossanitarioService componenteService;
    
    @GetMapping
    public List<ComponenteHidrossanitario> listarTodos() {
        return componenteService.listarTodos();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ComponenteHidrossanitario> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(componenteService.buscarPorId(id));
    }
    
    @PostMapping
    public ResponseEntity<ComponenteHidrossanitario> criar(@RequestBody ComponenteHidrossanitario componente) {
        return ResponseEntity.ok(componenteService.salvar(componente));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<ComponenteHidrossanitario> atualizar(@PathVariable Long id, @RequestBody ComponenteHidrossanitario componente) {
        componente.setId(id);
        return ResponseEntity.ok(componenteService.salvar(componente));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        componenteService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}