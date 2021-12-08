package com.gestaomongo.livros.repository;

import com.gestaomongo.livros.model.Autor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends MongoRepository<Autor, Integer> {

    public List<Autor> findByprimeiroNomeContaining(String nome);
}
