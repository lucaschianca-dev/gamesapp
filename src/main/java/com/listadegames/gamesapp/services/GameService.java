package com.listadegames.gamesapp.services;

import com.listadegames.gamesapp.dto.GameMinDTO;
import com.listadegames.gamesapp.entities.Game;
import com.listadegames.gamesapp.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        var result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
