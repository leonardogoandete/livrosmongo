package com.gestaomongo.livros.repository;

import com.gestaomongo.livros.model.Editora;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EditoraRepository extends MongoRepository<Editora, Integer> {
    public List<Editora> findBynomeContaining(String nome);
}
