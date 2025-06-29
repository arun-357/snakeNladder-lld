import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    private Queue<Player> players;
    private Board board;
    private Dice dice;

    public Game(Board board, List<Player> players) {
        this.players = new LinkedList<>(players);
        this.board = board;
        this.dice = new Dice();
    }

    public void start() {
        boolean win = false;

        while (!win) {
            Player currentPlayer = players.poll();
            int roll = dice.rollDice();
            int nextPosition = currentPlayer.getCurrentPosition() + roll;
            // Over roll
            if (nextPosition > board.getBoardSize()) {
                System.out.println(currentPlayer.getName() + " rolled " + roll + " but cannot move.");
                players.add(currentPlayer);
                continue;
            }

            int finalPosition = board.getFinalPosition(nextPosition);
            System.out.println(currentPlayer.getName() + " rolled " + roll + " and moved to " + finalPosition);

            currentPlayer.setCurrentPosition(finalPosition);

            if (finalPosition == board.getBoardSize()) {
                System.out.println("🏁 " + currentPlayer.getName() + " wins!");
                win = true;
            } else {
                players.add(currentPlayer);
            }
        }
    }
}
