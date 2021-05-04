package ChapterEight;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TictactoeTest {
    Tictactoe1 tictactoe;

    @BeforeEach
    void beforeEach() {
        String[][] strings = new String[3][3];
        tictactoe = new Tictactoe1(strings);
    }

    @AfterEach
    void afterEach() {
        tictactoe = null;
    }

    @Test
    void tictactoe1ShouldNotBeNull() {
        assertNotNull(tictactoe);
    }

    @Test
    void tictactoeConstructorShouldBeInitialized() {
        String[][] strings = new String[3][3];
        tictactoe.displayResult(1, 1);
        tictactoe.displayResult(2, 2);
        tictactoe.displayResult(1, 3);
        tictactoe.displayResult(2, 2);
        tictactoe.displayResult(1, 3);
        tictactoe.displayResult(2, 4);
        tictactoe.displayResult(1, 5);
        tictactoe.displayResult(2, 6);
        tictactoe.displayResult(1, 7);
    assertEquals("O",tictactoe.displayResult(2,8));
    assertEquals("X",tictactoe.displayResult(1,9));
    assertEquals("X", tictactoe.displayResult(1,1));

    }
@Test
    void method(){
    String[][] strings = new String[3][3];
    tictactoe.displayResult1(1, 1);
    tictactoe.displayResult1(2, 2);
    tictactoe.displayResult1(1, 3);
    tictactoe.displayResult1(2, 2);
    tictactoe.displayResult1(1, 3);
    tictactoe.displayResult1(2, 4);
    tictactoe.displayResult1(1, 5);
    tictactoe.displayResult1(2, 6);
    tictactoe.displayResult1(1, 7);
    tictactoe.displayResult1(2, 8);
    tictactoe.displayResult(1, 9);

}
@Test
    void methodCanCheckForWinningCases(){
        tictactoe.CheckForWinningCases();


}
}