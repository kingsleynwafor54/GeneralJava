package ChapterTen;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Car car=new Car();
        Scanner sc =new Scanner(System.in);
        System.out.println("Drivers methods"+car.drive());
        System.out.println("Number of tyres ="+car.numberOfLegs());
        System.out.println("Please Apply Break");
        int carSpeed=sc.nextInt();
        if (carSpeed ==0){
            System.out.println(car.pause());
        }
   if (carSpeed>0&&carSpeed<=50){
       System.out.println(car.slow());
   }
    if (carSpeed>50&&carSpeed<=100){
        System.out.println("A little bit"+car.slow());
    }
   if (carSpeed>100&&carSpeed<=140){
       System.out.println("NORMAL"+car.speed());
   }
    if (carSpeed>140){
        System.out.println("KILLER"+car.speed());
    }
        System.out.println(car.displayWatchFilm());
    }
}
