package Chaptere7;

import Chapter7.SalesCommission;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesCommissionTest {
    SalesCommission salesCommission;
    @BeforeEach
    void beforeEach(){
        salesCommission=new SalesCommission();
    }

@AfterEach
      void afterEach(){
          salesCommission=null;
    }
@Test
void methodCanCalculateSalesCommissionWithCounterTwoHundred(){
       int [] counter=new int[100];

       //salesCommission.calculateSaleCommission(counter);
       assertEquals(749,salesCommission.calculateSaleCommission(counter));
}

    @Test
    void methodCanCalculateSalesCommissionWithCounterThreeHundred(){
        double[] counter=new double[100];

        //salesCommission.calculateSaleCommission(counter);
        assertEquals(849,salesCommission.calculateSaleCommission(counter));
    }


}


