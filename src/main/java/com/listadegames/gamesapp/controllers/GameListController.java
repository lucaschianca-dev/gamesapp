package com.listadegames.gamesapp.controllers;

import com.listadegames.gamesapp.dto.GameListDTO;
import com.listadegames.gamesapp.dto.GameMinDTO;
import com.listadegames.gamesapp.dto.ReplacementDTO;
import com.listadegames.gamesapp.services.GameListService;
import com.listadegames.gamesapp.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.sourceIndex(), body.destinationIndex());
    }
}
