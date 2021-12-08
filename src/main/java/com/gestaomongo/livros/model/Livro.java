package com.gestaomongo.livros.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.Collection;

@Data
@Document(collection = "livro")
public class Livro implements Serializable {
    @Id
    //@GeneratedValue
    private int codigo;

    //@Column(nullable = false, unique = true)
    private String titulo;

    //@Column(nullable = false)
    private int ano;

    //@ManyToOne()
    private Editora editora;

    //@ManyToMany
    private Collection<Autor> autores;

}
