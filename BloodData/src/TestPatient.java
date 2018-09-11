public class TestPatient {
    public static void main(String[] args) {

        Patient defaultPatient = new Patient();
        Patient customPatient = new Patient(652, 22, "A", "-");

        System.out.println("Default Patient data:");
        System.out.println("ID number: " + defaultPatient.getIdNumber());
        System.out.println("Age: " + defaultPatient.getAge());
        System.out.println("Blood Type: " + defaultPatient.getBloodDataBloodType());
        System.out.println("Rh Factor: " + defaultPatient.getBloodDataRhFactor() + "\n");

        System.out.println("Custom Patient data:");
        System.out.println("ID number: " + customPatient.getIdNumber());
        System.out.println("Age: " + customPatient.getAge());
        System.out.println("Blood Type: " + customPatient.getBloodDataBloodType());
        System.out.println("Rh Factor: " + customPatient.getBloodDataRhFactor());
    }
}
