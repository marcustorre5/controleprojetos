package com.example.projetosapi.controller;

import com.example.projetosapi.model.ComponenteEletrico;
import com.example.projetosapi.service.ComponenteEletricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/componentes/eletricos")
public class ComponenteEletricoController {
    
    @Autowired
    private ComponenteEletricoService componenteService;
    
    @GetMapping
    public List<ComponenteEletrico> listarTodos() {
        return componenteService.listarTodos();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ComponenteEletrico> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(componenteService.buscarPorId(id));
    }
    
    @PostMapping
    public ResponseEntity<ComponenteEletrico> criar(@RequestBody ComponenteEletrico componente) {
        return ResponseEntity.ok(componenteService.salvar(componente));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<ComponenteEletrico> atualizar(@PathVariable Long id, @RequestBody ComponenteEletrico componente) {
        componente.setId(id);
        return ResponseEntity.ok(componenteService.salvar(componente));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        componenteService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}