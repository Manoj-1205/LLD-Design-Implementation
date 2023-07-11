package TicTacToe.Strategies.WinningStrategy;

public class RowCheckerStrategy implements CheckWinner{
    @Override
    public void checkWinner() {
        System.out.println("Row matched");
    }
}
