package africa.semicolon.mp3Player;

import java.util.ArrayList;

public class ArrayListPracticesTest {
    public static void main(String[] args) {
        String[] item = new String[5];
       ArrayListPractices arrayListPractices=new ArrayListPractices();
       // ArrayList<String> item =new ArrayList<String>();
       try {


           arrayListPractices.push("yellow");
           arrayListPractices.push("blue");
           arrayListPractices.push("black");
           arrayListPractices.push("Red");

           System.out.println(arrayListPractices.displayArray(item, "peace"));
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Error"+e);
       }
    }
}
