package Entity;

import java.util.Objects;

public class Position {
    private Float posX;
    private Float posY;

    public Position (Float posX, Float posY) {
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return Objects.equals(posX, position.posX) &&
                Objects.equals(posY, position.posY);
    }

    @Override
    public int hashCode () {
        return Objects.hash(posX, posY);
    }
}
