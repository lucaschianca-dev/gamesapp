package com.listadegames.gamesapp.repositories;

import com.listadegames.gamesapp.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
