public class SeatAssignment {
    private boolean[] firstClass = {false, false, false, false, false};
    private boolean[] economyClass = {false, false, false, false, false};

    public SeatAssignment(int economy, int bussiness) {
        this.firstClass = new boolean[economy];
        this.economyClass = new boolean[bussiness];
    }

    public boolean[] getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(boolean[] firstClass) {
        this.firstClass = firstClass;
    }

    public boolean[] getEconomyClass() {
        return economyClass;
    }

    public void setEconomyClass(boolean[] economyClass) {
        this.economyClass = economyClass;
    }
}
