package finalPacman;


public abstract class Character {
    protected int x; // Posisi karakter pada sumbu X
    protected int y; // Posisi karakter pada sumbu Y
    protected PacManModel.Direction direction; // Arah karakter

    public Character(int x, int y, PacManModel.Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public PacManModel.Direction getDirection() {
        return direction;
    }

    public void setDirection(PacManModel.Direction direction) {
        this.direction = direction;
    }

    // Metode abstrak untuk pergerakan karakter
    public abstract void move(PacManModel model);
}
