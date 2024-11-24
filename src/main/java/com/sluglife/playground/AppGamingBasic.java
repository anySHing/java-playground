package com.sluglife.playground;

import com.sluglife.playground.game.GameRunner;
import com.sluglife.playground.game.MarioGame;

public class AppGamingBasic {
    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}


