package TicTactoeTest;

import TicTacToe.Tictactoe;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TictactoeTest {
    Tictactoe tictactoe;

    @BeforeEach
    void beforeEach() {
        tictactoe = new Tictactoe();
    }

    @AfterEach
    void afterEach() {
        tictactoe = null;
    }

    @Test
    void testThatMethodCanTakeInArrays() {
        String[][] gameBoard = {{"   ", " | ", "   ", " | ", "   "},
                {"---", " * ", "---", " * ", "---"},
                {"   ", " | ", "   ", " | ", "   "},
                {"---", " * ", "---", " * ", "---"},
                {"   ", " | ", "   ", " | ", "   "}};
        Tictactoe.setGameBoard(gameBoard);
        assertNotNull(tictactoe.getGameBoard());
    }


    @Test
    void tictactoeCanDisplayItShape() {
        String[][] gameBoard ={};
        Tictactoe.setGameBoard(gameBoard);
        tictactoe.inputNumbers(1,1);
        assertNotNull(tictactoe.getGameBoard());

    }
    @Test
    void methodCanInputIntoTheShapeDisplayed(){
        String [][]gameBoard={};
        Tictactoe.setGameBoard(gameBoard);
        tictactoe.inputNumbers(5,2);
        System.out.println();
        tictactoe.inputNumbers(3,1);
        System.out.println();
        tictactoe.inputNumbers(4,1);
        System.out.println();
        tictactoe.inputNumbers(1,2);
        System.out.println();
        tictactoe.inputNumbers(6,1);
        System.out.println();
        tictactoe.inputNumbers(7,2);
        System.out.println();
        tictactoe.inputNumbers(8,1);
        System.out.println();
        tictactoe.inputNumbers(9,2);
        System.out.println();
        tictactoe.inputNumbers(2,1);
        assertNotNull(tictactoe.getGameBoard());
    }
@Test
    void methodCanTestForWinningCases(){
        String[][] gameBoard={};
        tictactoe.checkingWinnings();

}
}