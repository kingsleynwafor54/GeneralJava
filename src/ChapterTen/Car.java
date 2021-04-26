package ChapterTen;
public class Car extends Vehicle  {
    private Television Tv;
    @Override
    public String drive() {

        return "Forward,Sideways,and Backwards";

    }
    public int numberOfLegs() {
        return super.numberOfLegs();
    }

public String  displayWatchFilm(){
        return  "Watch Television";
}
}
