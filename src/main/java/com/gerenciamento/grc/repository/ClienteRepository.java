package com.gerenciamento.grc.repository;

import com.gerenciamento.grc.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
    List<Cliente> findByNomeContainingIgnoreCase(String nome);

    @Query("SELECT c FROM Cliente c WHERE MONTH(c.dataNasc) = :mesAtual")
    List<Cliente> findAniversariantesDoMes(@Param("mesAtual") int mesAtual);
}


