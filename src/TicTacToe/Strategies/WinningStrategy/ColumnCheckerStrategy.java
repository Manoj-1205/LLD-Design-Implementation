package TicTacToe.Strategies.WinningStrategy;

public class ColumnCheckerStrategy implements CheckWinner{
    @Override
    public void checkWinner() {
        System.out.println("Column matched");
    }
}
