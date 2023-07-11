package TicTacToe.models;

import TicTacToe.Strategies.LevelStrategy.LevelStrategy;
import TicTacToe.models.Enums.DifficultyLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BotPlayer extends Player{
    private LevelStrategy level;
    public Cell play(Board board){
        level.move();
        return null;
    }

}
