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

package com.petrovdns.tictactoe.model;

/**
 * <p>Instagram: @petrovdns
 * <p>Telegram: +37379666011 | @ixyck
 */
public class GameTable {
    private final char[] table = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public char getData(int index) {
        return table[index];
    }

    public void setData(int index, char sign) {
        table[index] = sign;
    }


    /*
    -------------
    | 7 | 8 | 9 |
    -------------
    | 4 | 5 | 6 |
    -------------
    | 1 | 2 | 3 |
    -------------
     */

    public void drawTable() {
        int index = table.length - 1;
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            System.out.println("| " + (table[index - i - 2]) + " | " +
                    (table[index - i - 1]) + " | " + (table[index - i]) + " |");
            index -= 2;
        }
        System.out.println("-------------");
    }
}
