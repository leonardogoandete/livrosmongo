package com.gestaomongo.livros.model;

import java.io.Serializable;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "autores")
public class Autor implements Serializable {
    @Id
    private int codigo;
    private String primeiroNome;
    private String ultimoNome;

}
