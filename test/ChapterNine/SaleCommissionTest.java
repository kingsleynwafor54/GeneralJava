package ChapterNine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SaleCommissionTest {
    SaleCommission1 saleCommission1;
    @BeforeEach
    void beforeEach(){
        saleCommission1=new SaleCommission1();

    }
@AfterEach
    void afterEach(){
    saleCommission1=null;

    }
   @Test
   void methodShouldBeAbleToCheckNotVoid(){
        assertNotNull(saleCommission1);
   }
@Test
    void methodShouldHaveAConstructor(){
        saleCommission1=new SaleCommission1("kingsley","Nwafor","12321",500,5);
        assertEquals(5,saleCommission1.getCommissionRate());
        assertEquals("kingsley",saleCommission1.getFirstName());
        assertEquals(500,saleCommission1.getGrossSale());
        assertEquals("Nwafor",saleCommission1.getLastName());
        assertEquals("12321",saleCommission1.getSocialSecurityNumber());
}
@Test
    void methodShouldBeAbleToSetMethods(){
        saleCommission1.setCommissionRate(500);
        saleCommission1.setFirstName("John");
        saleCommission1.setGrossSale(100);
        saleCommission1.setLastName("Kelvin");
        saleCommission1.setSocialSecurityNumber("Jenifer");
    assertEquals(500,saleCommission1.getCommissionRate());
    assertEquals("John",saleCommission1.getFirstName());
    assertEquals(100,saleCommission1.getGrossSale());
    assertEquals("Kelvin",saleCommission1.getLastName());
    assertEquals("Jenifer",saleCommission1.getSocialSecurityNumber());
    System.out.println(saleCommission1.toString());
    }
@Test
    void grossSetMethodShouldNotReceiveANegativeValue(){
        saleCommission1.setGrossSale(100);
    assertEquals(100,saleCommission1.getGrossSale());
}
@Test
    void commissionMethodShouldNotReceiveNegativeValue(){
        saleCommission1.setCommissionRate(1000);
        assertEquals(1000,saleCommission1.getCommissionRate());
}
@Test
    void earningMethodShouldBeAbleToMultiplyGrossSalesAndCommission(){
    saleCommission1.setCommissionRate(500);
    saleCommission1.setFirstName("John");
    saleCommission1.setGrossSale(100);
    saleCommission1.setLastName("Kelvin");
    saleCommission1.setSocialSecurityNumber("Jenifer");
    assertEquals(50000.0,saleCommission1.earnings());
}
}

