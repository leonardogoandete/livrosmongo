package com.gestaomongo.livros.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.Collection;

@Data
@Document(collection = "editora")
public class Editora implements Serializable {
    @Id
    private int codigo;
    private String nome;
    private Collection<Livro> livros;
}
