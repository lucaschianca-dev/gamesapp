package com.listadegames.gamesapp.dto;

import com.listadegames.gamesapp.entities.GameList;

public record GameListDTO(
        Long id,
        String name
) {
    public GameListDTO (GameList gameList) {
        this(
                gameList.getId(),
                gameList.getName());
    }
}
