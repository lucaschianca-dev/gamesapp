package com.listadegames.gamesapp.repositories;


import com.listadegames.gamesapp.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
