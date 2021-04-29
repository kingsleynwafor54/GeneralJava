package Chaptere7;

import Chapter7.DuplicateNumber;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateNumberTest {
    DuplicateNumber duplicateNumber;

    @BeforeEach
    void beforeEach() {
        duplicateNumber = new DuplicateNumber();
    }

    @AfterEach
    void afterEach() {
        duplicateNumber = null;
    }

    @Test
    void methodCanAddNumbers() {
//        ArrayList<Integer> arrayList=new ArrayList<>();
        duplicateNumber.push(50);
        duplicateNumber.push(60);
        duplicateNumber.push(30);
        duplicateNumber.push(50);
        duplicateNumber.push(50);
        duplicateNumber.push(50);
        duplicateNumber.push(50);
        duplicateNumber.push(50);
        assertEquals(3,duplicateNumber.arrayListSize());

    }
@Test
        void methodCanDeleteFromArrayList(){
    duplicateNumber.push(50);
    duplicateNumber.push(60);
    duplicateNumber.push(30);
    duplicateNumber.push(50);
    duplicateNumber.push(50);
    duplicateNumber.pop(2);
    duplicateNumber.push(67);
    duplicateNumber.pop(0);
    assertEquals(2,duplicateNumber.arrayListSize());
}
@Test
    void methodToCheckForOutOfBounds(){
        try {
            duplicateNumber.push(50);
            duplicateNumber.push(60);
          //  duplicateNumber.push(30);
            assertEquals(2bn  , duplicateNumber.arrayListSize());
        }
catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Olodo");
}
    }


}