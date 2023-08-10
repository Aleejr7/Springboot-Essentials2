package br.com.youtube.springboot2essentials.repository;

import br.com.youtube.springboot2essentials.model.Game;

import java.util.List;

public interface GameRepository {
    List<Game> listAll();
}
