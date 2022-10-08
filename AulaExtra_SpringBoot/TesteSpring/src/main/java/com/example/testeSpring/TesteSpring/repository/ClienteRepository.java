package com.example.testeSpring.TesteSpring.repository;
import com.example.testeSpring.TesteSpring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {



}
