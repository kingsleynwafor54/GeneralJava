package Chapter6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date {
    public static void main(String[] args) {
        LocalDate localDate= LocalDate.now();
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        System.out.println(localDate);
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);
    }
}
