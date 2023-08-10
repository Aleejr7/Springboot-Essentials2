package br.com.youtube.springboot2essentials.controller;

import br.com.youtube.springboot2essentials.model.Game;
import br.com.youtube.springboot2essentials.service.GameService;
import br.com.youtube.springboot2essentials.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("games")
@Log4j2
@AllArgsConstructor
public class GameController {
    @Autowired
    private final DateUtil dateUtil;
    private final GameService gameService;

    @GetMapping(path = "list")
    public List<Game> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return ResponseEntity.ok(gameService.listAll()).getBody();
    }

}
