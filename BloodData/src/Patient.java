public class Patient {
    private int idNumber;
    private int age;
    private BloodData bloodData = new BloodData();

    public Patient() {
        this.idNumber = 0;
        this.age = 0;
        this.bloodData.setBloodType("O");
        this.bloodData.setRhFactor("+");
    }

    public Patient(int idNumber, int age, String bloodType, String rhFactor) {
        this.idNumber = idNumber;
        this.age = age;
        this.bloodData.setBloodType(bloodType);
        this.bloodData.setRhFactor(rhFactor);
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public String getBloodDataBloodType() {
        return bloodData.getBloodType();
    }

    public String getBloodDataRhFactor() {
        return bloodData.getRhFactor();
    }
}
