package com.gestaomongo.livros.service;

import com.gestaomongo.livros.model.Editora;
import com.gestaomongo.livros.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditoraService {

    @Autowired
    private EditoraRepository editoraRepo;

    public void adicionaEditora(Editora editora){
        editoraRepo.save(editora);
    }

    public List<Editora> buscaEditoraNome(String nome){
        return (nome != null) ? editoraRepo.findBynomeContaining(nome) : editoraRepo.findAll();
    }

    public void apagaEditora(int id){
        editoraRepo.deleteById(id);
    }
}
