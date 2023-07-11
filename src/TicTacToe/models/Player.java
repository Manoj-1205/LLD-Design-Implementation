package TicTacToe.models;

import TicTacToe.models.Enums.Symbol;

public abstract class Player {
    private Symbol symbol;
    public abstract Cell play(Board board);
}
