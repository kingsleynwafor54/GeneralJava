package Chapter7;

import java.util.ArrayList;

public class DuplicateNumber {
    ArrayList<Integer> arrayList=new ArrayList<>();
public static int top=0;
    public void push(int number) {
        if (!(arrayList.contains(number))) {
            arrayList.add(number);
            top++;
        }
        for (int num : arrayList) {

            System.out.println(arrayList);
        }
    }
public ArrayList<Integer> getArrayList(){
        return arrayList;
}
public int pop(int number){
     return   arrayList.remove(number);
}

public int arrayListSize(){
        return arrayList.size();
}

}
