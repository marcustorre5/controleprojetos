package com.example.projetosapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ComponenteHidrossanitario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String descricao;
    private String tipo; // AGUA_FRIA, AGUA_QUENTE, ESGOTO, DRENAGEM, etc.
    private String material; // PVC, COBRE, PPR, etc.
    private Double diametro;
    private Double comprimento;
    private Double custoUnitario;
    
    @ManyToOne
    @JoinColumn(name = "projeto_id")
    private Projeto projeto;
}