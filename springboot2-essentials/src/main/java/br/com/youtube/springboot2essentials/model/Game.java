package br.com.youtube.springboot2essentials.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data                 // --> Gera getters, setters, hashcode, tostring...
@AllArgsConstructor   // --> Criar o construtor com todos os atributos.
public class Game {
    private Long id;
    private String name;
}
