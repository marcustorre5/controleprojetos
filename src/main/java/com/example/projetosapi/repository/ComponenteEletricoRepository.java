package com.example.projetosapi.repository;

import com.example.projetosapi.model.ComponenteEletrico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponenteEletricoRepository extends JpaRepository<ComponenteEletrico, Long> {
}