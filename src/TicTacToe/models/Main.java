package TicTacToe.models;

import TicTacToe.Strategies.LevelStrategy.GPTMove;
import TicTacToe.Strategies.WinningStrategy.RowCheckerStrategy;

public class Main {
    public static void main(String[] args) {
        BotPlayer botPlayer = new BotPlayer(new GPTMove());
        botPlayer.play(new Board());
        Game game=new Game();
        game.checkWinner(new RowCheckerStrategy());
    }
}
