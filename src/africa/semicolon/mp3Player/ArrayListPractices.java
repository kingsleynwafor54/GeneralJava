package africa.semicolon.mp3Player;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListPractices {
  String[] item = new String[5];
  int top=0;
  public void  push(String itemy) {
    item[top]=itemy;
    top++;


  }

  public  String displayArray(String[] itemy, String header) {
      int counter;
      System.out.println(header);
      for (counter = 0; counter < item.length; counter++){
          System.out.println(item[counter]);

  }

return " ";
  }
public String deleteObjectFromAnArray(){
    String itemy;
    top--;
    itemy=item[top];
    item[top]= null;
    return itemy;
}

//public String getDisplayArrays(){
//    return
//}
}