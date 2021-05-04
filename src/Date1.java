public class Date1 {
    private int day;
    private int month;
    private int year;
    private int currentYear;



    public Date1(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
//    public int Age(int currentYear )


    //    @Override
//    public String toString() {
//        return "Date1{" +
//                "day=" + day +'\''+
//                ", month=" + month +'\''+
//                ", year=" + year +
//                '}';
//    }
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
