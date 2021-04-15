package Turtle;

import static Turtle.Direction.EAST;
import static Turtle.Direction.SOUTH;
import static Turtle.Direction.WEST;
import static Turtle.Direction.NORTH;
public class Turtle {
    private final Pen pen;
    private Direction currentDirection;
    private Position currentPosition;

    public Turtle(Pen pen) {
        this.pen = pen;
        currentDirection = EAST;
        currentPosition=new Position( 0,0);
    }

    public Pen getPen() {
        return pen;
    }

    public void movePenUp() {
        pen.setIsUp(true);
    }

    public boolean isPenUp() {
        return pen.isUp();
    }

    public void movePenDown() {
        pen.setIsUp(false);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection) {
            case EAST -> currentDirection=SOUTH;
            case WEST -> currentDirection=NORTH;
            case SOUTH -> currentDirection=WEST;
            case NORTH -> currentDirection=EAST;
        }
    }
public void moveForwardBy(int numberOfStep){
    switch (currentDirection){
        case EAST -> currentPosition.increaseColumnPositionBy(numberOfStep);
    }
}
public Position getCurrentPosition(){
        return currentPosition;
}
}