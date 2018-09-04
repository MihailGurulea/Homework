public class Date {
    private int month;
    private int day;
    private int year;

    public Date(){
        this.month = 1;
        this.day = 1;
        this.year = 1900;
    }

    public void showDate(){
        System.out.println("\n" + getMonth()+ "/" + getDay() + "/" + getYear());
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
