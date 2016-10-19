package pl.edukawka.battleship;

/**
 * Created by Aleksander on 19.10.2016.
 */
public class Field {
    private final int x;
    private final int y;
    private State state;

    public Field(int x, int y, State state){
        this.x = x;
        this.y = y;
        this.state = state;
    }
}
