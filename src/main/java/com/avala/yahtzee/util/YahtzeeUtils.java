package com.avala.yahtzee.util;

import org.springframework.stereotype.Component;

@Component
public class YahtzeeUtils {

    public static String generateGameCode() {
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            char letter = (char)(65 + ((Math.random() * 100) % 26));
            code.append(letter);
        }
        return code.toString();
    }
}
