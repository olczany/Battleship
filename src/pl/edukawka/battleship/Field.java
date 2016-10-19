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

    public char stateToChar() {
        char value;
        switch (state) {
            case EMPTY:
                value = ' ';
                break;
            case MISS:
                value = 'O';
                break;
            default:
                value = '?';
        }
        return value;
    }

    public void setState(State state){
        this.state = state;
    }
}
