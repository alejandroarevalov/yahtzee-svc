package com.avala.yahtzee.service;

import com.avala.yahtzee.model.Game;
import org.springframework.stereotype.Service;

@Service
public interface YahtzeeService {

    Game createNewGame();

    Boolean initGame(String gameId, Game game);
}
