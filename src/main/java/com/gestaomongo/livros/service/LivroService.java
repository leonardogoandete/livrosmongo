package com.gestaomongo.livros.service;

import com.gestaomongo.livros.model.Livro;
import com.gestaomongo.livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepo;

    public void adicionarLivro(Livro livro){
        livroRepo.save(livro);
    }

    public List<Livro> buscaLivrosNome(String nome){
        return (nome != null) ? livroRepo.findBytituloContaining(nome) : livroRepo.findAll();
    }

    public void apagaLivro(int id){
        livroRepo.deleteById(id);
    }
}
