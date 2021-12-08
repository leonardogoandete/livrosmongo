package com.gestaomongo.livros.controler;


import com.gestaomongo.livros.model.Editora;
import com.gestaomongo.livros.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoras")
public class EditoraControler {

    @Autowired
    private EditoraService editoraService;

    @GetMapping()
    public List<Editora> listarEditorasFiltro(@RequestParam(required = false) String nome){
        return editoraService.buscaEditoraNome(nome);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionarEditora(@RequestBody Editora editora){
        editoraService.adicionaEditora(editora);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletaEditora(@PathVariable int id){
        editoraService.apagaEditora(id);
    }
}
