package test.p;


import test.d.Lease;

public class TestLease {
    public static void main(String[] args) {
        Lease object1 = new Lease();
        Lease object2 = new Lease();
        Lease object3 = new Lease();
        Lease object4 = new Lease();

        object1.getData();
        object2.getData();
        object3.getData();

        object1.showValues();
        object1.addPetFee();
        object1.showValues();

        object2.setRent(3);
        object2.showValues();
        object3.showValues();
        object4.showValues();
    }
}
