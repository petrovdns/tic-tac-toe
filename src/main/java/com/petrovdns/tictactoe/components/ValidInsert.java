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

/**
 * <p>Instagram: @petrovdns
 * <p>Telegram: +37379666011 | @ixyck
 */
public class ValidInsert {
    protected boolean isValidInsert(GameTable gameTable, int allInput) {
        char allChar = (char) (allInput + '0');
        return '9' >= allChar && allChar >= '1'
                && gameTable.getData(allInput - 1) != 'X'
                && gameTable.getData(allInput - 1) != 'O';
    }
}
