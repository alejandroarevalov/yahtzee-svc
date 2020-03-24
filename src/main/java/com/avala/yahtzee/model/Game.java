package com.avala.yahtzee.model;

import lombok.Data;

import java.util.List;

@Data
public class Game {
    private String code;
    private List<Player> players;
}
