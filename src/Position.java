public class Position {
    private int xPos;
    private int yPos;

    public Position(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    void up() {
        this.xPos++;
    }
    void down() {
        this.xPos--;
    }
    void left() {
        this.yPos--;
    }
    void right() {
        this.yPos++;
    }
}
