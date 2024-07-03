package com.example.prova2024.controller;

import com.example.prova2024.entity.Proprietario;
import com.example.prova2024.service.ProprietarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("proprietarios")
public class ProprietarioController {

    @Autowired
    ProprietarioService proprietarioService;

    @PostMapping("cadastrar")
    public String cadastrarProprietario(@RequestBody @Valid Proprietario proprietario){
        proprietarioService.cadastrarProprietario(proprietario);
        return "Proprietario cadastrado com sucesso!";
    }

    @GetMapping("buscar/{id}")
    public List<Proprietario> buscarProprietarios(){
        return proprietarioService.buscarProprietarios();
    }

    @PutMapping("atualizar/{id}")
    public String atualizarProprietario(@RequestBody @Valid Proprietario proprietario){
        proprietarioService.atualizarProprietario(proprietario);
        return "Proprietario atualizado com sucesso!";
    }

    @DeleteMapping("deletar/{id}")
    public String deletarProprietario(@PathVariable Long id){
        proprietarioService.deletarProprietario(id);
        return "Dados do proprietario deletado!";
    }
}
