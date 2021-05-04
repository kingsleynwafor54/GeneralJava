import java.util.Date;

public class User {
    private String name;
    private String password;
    private int iD;
    private String phoneNumber;
    private Date1 dateJoined;
    private Date1 dateJoined1;


    public User(String name, String password, int iD, String phoneNumber,Date1 dateJoined,Date1 dateJoined1) {
        this.name = name;
        this.password = password;
        this.iD = iD;
        this.phoneNumber = phoneNumber;
        this.dateJoined=dateJoined;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setDateJoined(Date1 dateJoined){
        this.dateJoined =dateJoined;
    }
    public Date1 getDateJoined(){
        return this.dateJoined;
    }

    @Override
    public String toString() {
        return "User{" +
                "name'" + name + '\'' +
                ", password'" + password + '\'' +
                ", iD" + iD +
                ", phoneNumber'" + phoneNumber + '\'' +
                ", dateJoined" + dateJoined +  '\''+
                ",dateJoined1" + dateJoined +
                '}';
    }


    public static class UserTest{

        public static void main(String[] args) {
            Date1 date =new Date1(12,2,2002);
            Date1 date1 =new Date1(12,2,1998);
           User user = new User("Kingsley", "1234", 1, "07033621105",date,date1);
          // User user1 = new User("Kingsley", "1234", 1, "07033621105",date1);
            System.out.println(date.getYear());
           //System.out.println(user.getiD(), user.password, user);
           System.out.println(user.toString());
          // System.out.println(user1.toString());
            date.setCurrentYear(2021);
            System.out.println(date.getCurrentYear()-date.getYear());
            System.out.println(user.getDateJoined());
        }

    }

}

