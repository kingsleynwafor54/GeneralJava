package Turtle;

public class Pen {
//    private String penColour;
//    public Pen(String penName){
//        this.penName=penName;
//    }
//public Turtle getTurtle(){
//    System.out.println(this.penName);
//        return new Turtle (this);
//}
  private  boolean isDown;
    public void setIsUp(boolean isUp){
        isDown=!isUp;
    }

    public boolean isUp() {
        return !isDown;
    }
}
