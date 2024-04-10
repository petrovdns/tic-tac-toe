/*
 *    Copyright 2024 Petrov Dionisie
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.petrovdns.tictactoe;

import com.petrovdns.tictactoe.gameprocess.Game;
import com.petrovdns.tictactoe.resolution.*;

/**
 * <p>Instagram: @petrovdns
 * <p>Telegram: +37379666011 | @ixyck
 */

public class Launcher {
    public static void main(String[] args) {
        final Game game = new Game(
                new UserStep(),
                new PcStep(),
                new StepVerifier(),
                new WinnerVerifier(),
                new Settings()
        );

        //start game!
        game.play();

    }
}
