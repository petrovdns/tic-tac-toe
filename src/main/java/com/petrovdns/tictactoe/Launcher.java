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

import com.petrovdns.tictactoe.gamelogic.Game;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Instagram: @petrovdns
 * <p>Telegram: +37379666011 | @ixyck
 */

public class Launcher {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        var game = context.getBean("game", Game.class);

        //start game!
        game.play();
    }
}
