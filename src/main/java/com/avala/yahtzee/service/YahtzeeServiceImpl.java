package com.avala.yahtzee.service;

import com.avala.yahtzee.model.Game;
import com.avala.yahtzee.util.YahtzeeUtils;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

public class YahtzeeServiceImpl implements YahtzeeService {

    private Map<String, Game> gameController;

    public YahtzeeServiceImpl() {
        gameController = new HashMap<>();
    }

    public Game createNewGame() {
        Game game = new Game();
        String gameCode = YahtzeeUtils.generateGameCode();
        game.setCode(gameCode);
        gameController.put(gameCode, game);
        return game;
    }

    public Boolean initGame(String gameId, Game game) {
        Game foundGame = gameController.get(gameController);
        if (foundGame == null) {
            gameController.replace(gameId, game);
        }
        return true;
    }
}
