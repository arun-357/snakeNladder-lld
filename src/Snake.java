public class Snake {
    private final int startAt;
    private final int endAt;

    public Snake(int startAt, int endAt) throws IllegalAccessException {
        if (startAt <= endAt)
            throw new IllegalAccessException("Snake head must be above tail");
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
