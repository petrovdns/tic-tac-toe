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

package com.petrovdns.tictactoe.gamelogic;

import com.petrovdns.tictactoe.components.*;
import com.petrovdns.tictactoe.model.GameTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>Instagram: @petrovdns
 * <p>Telegram: +37379666011 | @ixyck
 */

@Component
public class Game {
    @Autowired
    private UserStep userStep;
    @Autowired
    private PcStep pcStep;
    @Autowired
    private StepVerifier stepVerifier;
    @Autowired
    private WinnerVerifier winnerVerifier;
    @Autowired
    private Settings settings;
    @Autowired
    private GameTable gameTable;

    public void play() {
        int gameStep = settings.getStep(); //9
        gameTable.drawTable();
        while (true) {
            if (winnerVerifier.checkWin(gameTable) && stepVerifier.checkGameStep(gameStep--)) {
                userStep.input(gameTable, settings.getPlayerChar());
            } else {
                break;
            }

            if (winnerVerifier.checkWin(gameTable) && stepVerifier.checkGameStep(gameStep--)) {
                pcStep.input(gameTable, settings.getPcChar());
            } else {
                break;
            }
        }
    }
}
