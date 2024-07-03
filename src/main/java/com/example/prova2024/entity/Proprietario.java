package com.example.prova2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Proprietario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min=3, max=100, message="O nome precisa ter entre 3 e 100 caracteres!")
    private String nome;

    private String cpf;

    @Email(message="O email é inválido!")
    private String email;

    private String telefone;

    private String endereco;

    @Past(message = "Data de nascimento inválaida!")
    private LocalDate dataNascimento;

    private LocalDate dataCadastro;

    @OneToMany(mappedBy = "proprietario")
    private List<Carro> carros;
}