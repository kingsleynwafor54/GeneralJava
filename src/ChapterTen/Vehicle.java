package ChapterTen;

import static ChapterTen.vehicleStates.*;

public abstract class Vehicle {

    private String Drive;
    private vehicleStates currentDriving;

    private int legs;
    public vehicleStates pause(){
        return currentDriving=PAUSE;
    }
    public abstract String drive();

    public int numberOfLegs(){
        return legs=5;
    }
public vehicleStates speed(){
        return currentDriving=SPEED;
}
public vehicleStates slow(){
        return currentDriving= SLOW;
}
}
