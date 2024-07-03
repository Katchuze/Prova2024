package com.example.prova2024.service;

import com.example.prova2024.entity.Proprietario;
import com.example.prova2024.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProprietarioService {

    @Autowired
    ProprietarioRepository proprietarioRepository;

    public Proprietario cadastrarProprietario(Proprietario proprietario) {return proprietarioRepository.save(proprietario);}

    public List<Proprietario> buscarProprietarios(){return proprietarioRepository.findAll();}

    public Proprietario atualizarProprietario (Proprietario proprietario){return proprietarioRepository.save(proprietario);}

    public void deletarProprietario(Long id){proprietarioRepository.deleteById(id);}
}
