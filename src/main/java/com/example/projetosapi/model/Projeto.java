package com.example.projetosapi.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String descricao;
    private String localizacao;
    private LocalDate dataInicio;
    private LocalDate dataPrevistaTermino;
    private String status; // EM_PLANEJAMENTO, EM_ANDAMENTO, CONCLUIDO, CANCELADO
    
    @OneToMany(mappedBy = "projeto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ComponenteEletrico> componentesEletricos;
    
    @OneToMany(mappedBy = "projeto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ComponenteHidrossanitario> componentesHidrossanitarios;
}