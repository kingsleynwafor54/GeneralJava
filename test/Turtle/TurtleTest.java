package Turtle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    Pen pen;
    Turtle turtle;
    Pen blackPen;

    @BeforeEach
    void beforeEach() {
        pen = new Pen();
        blackPen = new Pen();
        turtle = new Turtle(blackPen);
    }

    @AfterEach
    void afterEach() {
        pen = null;
        blackPen = null;
        turtle = null;
    }

    @Test
    void turtleHasPenTest() {

        assertNotNull(turtle.getPen());
        // assertEquals(new Pen(),new Pen());
        assertEquals(blackPen, turtle.getPen());
        assertNotEquals(pen, turtle.getPen());
    }

    @Test
    void turtleCanMovePenUtp() {
        turtle.movePenUp();
        //turtle.getPen().getTurtle().getPen().getTurtle();
        //assertEquals("penName",Turtle.getTurtle());
        assertFalse(!turtle.isPenUp());
    }

    @Test
    void turtleCanMovePenDown() {
        assertTrue(turtle.isPenUp());
        turtle.movePenDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    void turtleCanTurnRightWhileFacingEast() {
        //given
        assertEquals(Direction.EAST, turtle.getCurrentDirection());


        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingSouth() {
        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingWest() {
        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.WEST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRightWhileFacingNorth() {
        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.NORTH, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnRigthWhileFacingEast() {
        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveForwardFacingEast() {
        assertEquals(Direction.EAST, turtle.getCurrentDirection());
        turtle.moveForwardBy(2);
        assertEquals(new Position(0, 2), turtle.getCurrentPosition());
    }
}