package com.restapi.firstcrud.controller;

import java.util.List;
import com.restapi.firstcrud.model.Carro;
import com.restapi.firstcrud.model.CarroRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CarroController {
    
    CarroRepository repository;

    @GetMapping("/carro/all")
    public List<Carro> getAllCarros(){
        return repository.findAll();
    }

    @GetMapping("/carro/byid/{id}")
    public Carro getCarroById(@PathVariable Long id){
        return repository.findById(id).get();
    }

    @PostMapping("/carro/save")
    public Carro saveCarro(@RequestBody Carro carro){
        return repository.save(carro);
    }

    @DeleteMapping("/carro/delete/{id}")
    public void deleteCaroo(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PutMapping("/carro/update")
    public Carro updateCarro(@RequestBody Carro carro){
        return repository.save(carro);
    }

}
