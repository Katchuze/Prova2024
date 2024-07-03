package com.example.prova2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min=3, max=100, message="O modelo precisa ter entre 3 e 100 caracteres!")
    private String modelo;

    @Size(min=2, max=100, message="A merca precisa ter entre 3 e 100 caracteres!")
    private String marca;

    @Max(value=2024, message="O ano deve ser abaixo de 2024!")
    @Min(value=1885, message="O ano deve ser acima de 1885!")
    private int ano;

    private String cor;

    @Min(value=1, message="O preço deve ser maior que 0!")
    private Double preco;

    @Min(value=0, message="A quilometragem deve ser maior ou igual a 0!")
    private Double quilometragem;

    @NotNull(message="Este campo não pode estar vazio!")
    private Tipo tipo;

    private LocalDateTime dataCadastro;

    @ManyToOne
    private Proprietario proprietario;
}

//tipo: deve ser uma das opções prédefinidas (e.g., "SEDAN", "HATCH", "SUV", "PICKUP")