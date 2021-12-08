package com.gestaomongo.livros.controler;

import com.gestaomongo.livros.model.Autor;
import com.gestaomongo.livros.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorControler {

    @Autowired
    private AutorService autorService;

    @GetMapping()
    public List<Autor> listarAutorFiltro(@RequestParam(required = false) String nome){
        return autorService.buscaAutorNome(nome);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionarAutor(@RequestBody Autor autor){
        autorService.adicionaAutor(autor);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletaAutor(@PathVariable int id){
        autorService.apagaAutor(id);
    }
}
