package TicTacToe.models;

import TicTacToe.Strategies.LevelStrategy.GPTMove;
import TicTacToe.Strategies.WinningStrategy.CheckWinner;
import TicTacToe.Strategies.WinningStrategy.ColumnCheckerStrategy;
import TicTacToe.Strategies.WinningStrategy.WinnerContext;

public class Game {
    private Board board;
    private Player player;

//    BotPlayer bot = new BotPlayer(new GPTMove());
    public void startGame(HumanPlayer humanPlayer, BotPlayer botPlayer){

    }

    public void makeMove(Board board){
        //Make move implementation
    }

    public void checkWinner(CheckWinner checkWinner){

        WinnerContext winnerContext = new WinnerContext(checkWinner);
        winnerContext.winner();
    }
}
