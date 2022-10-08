package com.example.testeSpring.TesteSpring.controller;
import com.example.testeSpring.TesteSpring.model.Cliente;
import com.example.testeSpring.TesteSpring.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController // rest, porque corresponde ao endpooint
@RequestMapping("/cliente") // www.https..../cliente...

public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente); // é a mesma coisa que insert into cliente values(...)
    }

    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll(); // é a mesma coisa que insert into cliente values(...)
    }

}
