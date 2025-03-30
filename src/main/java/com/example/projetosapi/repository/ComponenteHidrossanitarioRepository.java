package com.example.projetosapi.repository;

import com.example.projetosapi.model.ComponenteHidrossanitario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponenteHidrossanitarioRepository extends JpaRepository<ComponenteHidrossanitario, Long> {
}