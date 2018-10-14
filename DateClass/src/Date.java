public class Date {
    private int dd;
    private int ddd;
    private int yyyy;
    private int mm;
    private String month;

    public Date(int mm, int dd, int yyyy) {
        this.dd = dd;
        this.yyyy = yyyy;
        this.mm = mm;
    }

    public Date(int ddd, int yyyy) {
        this.ddd = ddd;
        this.yyyy = yyyy;
    }

    public Date(String month, int dd, int yyyy) {
        this.dd = dd;
        this.yyyy = yyyy;
        this.month = month;
    }

    void printMM(){
        System.out.println(this.mm + "/" + this.dd + "/" + this.yyyy);
    }

    void printDDD(){
        System.out.println(this.ddd + " " + this.yyyy);
    }

    void printStringDate(){
        System.out.println(this.month + " " + this.dd + ", " + this.yyyy);
    }


}
