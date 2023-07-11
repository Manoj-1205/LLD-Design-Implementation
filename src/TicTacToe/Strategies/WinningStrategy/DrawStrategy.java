package TicTacToe.Strategies.WinningStrategy;

public class DrawStrategy implements CheckWinner{

    @Override
    public void checkWinner() {
        System.out.println("Match Draw");
    }
}
