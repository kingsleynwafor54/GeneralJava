package Chaptere7;

import Chapter7.RollDieSimulation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class RollDiceSimulationTest {
    RollDieSimulation rollDieSimulation;
    @BeforeEach
    void beforeEach(){
        rollDieSimulation=new RollDieSimulation();
    }
@AfterEach
    void afterEach(){
        rollDieSimulation=null;
}
@Test
    void methodCanRollDice(){
   // rollDieSimulation.rollDice();
    System.out.println(rollDieSimulation.sumOfDice());
    assertNotEquals(3,rollDieSimulation.sumOfDice());
//       int roll= rollDieSimulation.rollDice();

}




}
