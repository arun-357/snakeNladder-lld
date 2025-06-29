import java.util.Random;

public class Dice {
    private int max;
    private Random random = new Random();

    public Dice(int max) {
        this.max = 6;
    }

    public int rollDice() {
        return random.nextInt(max) + 1;
    }
}
