package com.example.bibliotecapessoal.repository;

import com.example.bibliotecapessoal.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {}
