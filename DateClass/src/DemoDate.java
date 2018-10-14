public class DemoDate {
    public static void main(String[] args) {
        Date date1 = new Date(10,25, 2018);
        date1.printMM();
        Date date2 = new Date("June",22,2011);
        date2.printStringDate();
        Date date3 = new Date(123,2018);
        date3.printDDD();
    }
}
