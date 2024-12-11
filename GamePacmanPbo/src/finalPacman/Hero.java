package finalPacman;

public class Hero extends Character {
    public Hero(int x, int y, PacManModel.Direction direction) {
        super(x, y, direction);
    }

    @Override
    public void move(PacManModel model) {
        // Logika pergerakan Pac-Man berdasarkan arah
        if (this.direction == PacManModel.Direction.RIGHT) this.x++;
        else if (this.direction == PacManModel.Direction.LEFT) this.x--;
        else if (this.direction == PacManModel.Direction.UP) this.y--;
        else if (this.direction == PacManModel.Direction.DOWN) this.y++;
    }
}
