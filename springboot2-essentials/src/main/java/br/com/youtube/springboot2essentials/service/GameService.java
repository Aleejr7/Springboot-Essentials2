package br.com.youtube.springboot2essentials.service;

import br.com.youtube.springboot2essentials.model.Game;
import org.springframework.stereotype.Service;

import java.util.List;
@Service  // --> Declara que é uma classe do Spring, de serviços. Para injeção de dependecias reconhecer
public class GameService {
    //private final GameRepository gameRepository;
    public List<Game> listAll(){
        return List.of(new Game(1L, "Valorant"), new Game(2L, "COD"));
    }
}
