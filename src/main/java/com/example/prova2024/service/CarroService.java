package com.example.prova2024.service;

import com.example.prova2024.entity.Carro;
import com.example.prova2024.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    @Autowired
    CarroRepository carroRepository;

    public Carro cadastrarCarro(Carro carro) {return carroRepository.save(carro);}

    public List<Carro> buscarCarros(){return carroRepository.findAll();}

    public Carro atualizarCarro (Carro carro){return carroRepository.save(carro);}

    public void deletarCarro(Long id){carroRepository.deleteById(id);}
}
