package finalPacman;

public class Enemy extends Character {
    public Enemy(int x, int y, PacManModel.Direction direction) {
        super(x, y, direction);
    }

    @Override
    public void move(PacManModel model) {
        // Logika pergerakan Ghost (misalnya, bergerak secara acak)
        if (this.direction == PacManModel.Direction.RIGHT) this.x++;
        else if (this.direction == PacManModel.Direction.LEFT) this.x--;
        else if (this.direction == PacManModel.Direction.UP) this.y--;
        else if (this.direction == PacManModel.Direction.DOWN) this.y++;
    }
}
