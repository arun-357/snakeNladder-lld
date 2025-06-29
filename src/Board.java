import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private int boardSize;
    private Map<Integer, Integer> jumpMap = new HashMap<>();

    public Board(int boardSize, List<Snake> snakes, List<Ladder> ladders) {
        this.boardSize = boardSize;
        for (Snake s: snakes)
            jumpMap.put(s.getStartAt(), s.getEndAt());

        for (Ladder l: ladders)
            jumpMap.put(l.getStartAt(), l.getEndAt());
    }

    public int getFinalPosition(int pos) {
        return jumpMap.getOrDefault(pos, pos);
    }

    public int getBoardSize() {
        return boardSize;
    }
}
