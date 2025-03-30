package com.example.projetosapi.controller;

import com.example.projetosapi.model.Projeto;
import com.example.projetosapi.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projetos")
public class ProjetoController {
    
    @Autowired
    private ProjetoService projetoService;
    
    @GetMapping
    public List<Projeto> listarTodos() {
        return projetoService.listarTodos();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Projeto> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(projetoService.buscarPorId(id));
    }
    
    @PostMapping
    public ResponseEntity<Projeto> criar(@RequestBody Projeto projeto) {
        return ResponseEntity.ok(projetoService.salvar(projeto));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Projeto> atualizar(@PathVariable Long id, @RequestBody Projeto projeto) {
        projeto.setId(id);
        return ResponseEntity.ok(projetoService.salvar(projeto));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        projetoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}