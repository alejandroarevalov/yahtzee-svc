package com.avala.yahtzee.rest;

import com.avala.yahtzee.model.Game;
import com.avala.yahtzee.service.YahtzeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class YahtzeeRestController {

    @Autowired
    private YahtzeeService yahtzeeService;

    @GetMapping("/newgame")
    public Game createNewGame() {
        return yahtzeeService.createNewGame();
    }

    @PostMapping("/initGame/{gameId}")
    public Boolean initGame(@PathVariable String gameId, @RequestBody Game game) {
        return yahtzeeService.initGame(gameId, game);
    }
}
