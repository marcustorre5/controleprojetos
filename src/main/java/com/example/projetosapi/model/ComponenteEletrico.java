package com.example.projetosapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ComponenteEletrico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String descricao;
    private String tipo; // ILUMINACAO, TOMADA, QUADRO_DISTRIBUICAO, etc.
    private String especificacoes;
    private Integer quantidade;
    private Double custoUnitario;
    
    @ManyToOne
    @JoinColumn(name = "projeto_id")
    private Projeto projeto;
}