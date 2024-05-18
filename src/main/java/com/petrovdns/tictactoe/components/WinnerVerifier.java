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

package com.petrovdns.tictactoe.components;

import com.petrovdns.tictactoe.model.GameTable;
import org.springframework.stereotype.Component;

/**
 * <p>Instagram: @petrovdns
 * <p>Telegram: +37379666011 | @ixyck
 */

@Component
public class WinnerVerifier {
    public boolean checkWin(GameTable gameTable) {
        boolean win = false;
        int[][] combinationOfWin = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9},
                {7, 4, 1}, {8, 5, 2}, {9, 6, 3},
                {7, 5, 3}, {9, 5, 1}
        };

        for (int[] pack : combinationOfWin) {
            if (gameTable.getData(pack[0] - 1) == gameTable.getData(pack[1] - 1)
                    && gameTable.getData(pack[1] - 1) == gameTable.getData(pack[2] - 1)) {
                win = true;
                System.out.println("Player: " + "'" + gameTable.getData(pack[0] - 1) + "'" + " wins!");
                break;
            }
        }

        return !win;
    }
}
