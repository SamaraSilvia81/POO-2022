package com.example.testeSpring.TesteSpring.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cliente") // usamos para permitir alguma alteração futura, porque automaticamente  já vai o nome do arquivo
@Getter @Setter  // cria, mas não mostra. Deixa clean o código
@AllArgsConstructor // já faz o construtor automaticamente
@NoArgsConstructor // gera um construtor padrão, sem argumento

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // não precisa setar valores iniciais
    private Long id; // armazena mais que o INT

    @Column(name = "nome",length = 100)
    @NotNull // é obrigatório algum valor
    private String nome;

    @Column(name = "cpf",length = 14)
    @NotNull
    private String cpf;






}
