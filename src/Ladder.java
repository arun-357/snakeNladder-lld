public class Ladder {
    private int startAt;
    private int endAt;

    public Ladder(int startAt, int endAt) throws IllegalAccessException {
        if (startAt >= endAt)
            throw new IllegalAccessException("Ladder start must be below end");
        this.startAt = startAt;
        this.endAt = endAt;
    }

    public int getStartAt() {
        return startAt;
    }

    public int getEndAt() {
        return endAt;
    }
}
