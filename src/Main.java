import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        List<Snake> snakes = Arrays.asList(
                new Snake(99, 1),
                new Snake(97, 78),
                new Snake(62, 22)
        );

        List<Ladder> ladders = Arrays.asList(
                new Ladder(4, 25),
                new Ladder(13, 46),
                new Ladder(42, 84)
        );

        Board board = new Board(100, snakes, ladders);
        List<Player> players = Arrays.asList(new Player("Arun"), new Player("Dev"));

        Game game = new Game(board, players);
        game.start();
    }
}