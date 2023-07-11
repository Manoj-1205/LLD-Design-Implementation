package TicTacToe.Strategies.WinningStrategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WinnerContext {
    private CheckWinner checkWinner;
    public void winner(){
        checkWinner.checkWinner();
    }
}
