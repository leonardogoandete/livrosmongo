package com.gestaomongo.livros.repository;


import com.gestaomongo.livros.model.Editora;
import com.gestaomongo.livros.model.Livro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends MongoRepository<Livro, Integer> {
    public List<Livro> findBytituloContaining(String nome);
}
