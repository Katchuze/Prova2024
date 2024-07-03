package com.example.prova2024.controller;

import com.example.prova2024.entity.Carro;
import com.example.prova2024.service.CarroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("carros")
public class CarroController {

    @Autowired
    CarroService carroService;

    @PostMapping("cadastrar")
    public String cadastrarCarro(@RequestBody @Valid Carro carro){
        carroService.cadastrarCarro(carro);
        return "Carro cadastrado com sucesso!";
    }

    @GetMapping("buscar/{id}")
    public List<Carro> buscarCarros(){
        return carroService.buscarCarros();
    }

    @PutMapping("atualizar/{id}")
    public String atualizarCarro(@RequestBody @Valid Carro carro){
        carroService.atualizarCarro(carro);
        return "Carro atualizado com sucesso!";
    }

    @DeleteMapping("deletar/{id}")
    public String deletarCarro(@PathVariable Long id){
        carroService.deletarCarro(id);
        return "Dados do carro deletado!";
    }
}
