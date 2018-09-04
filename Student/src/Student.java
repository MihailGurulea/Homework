public class Student {
    public static void main(String[] args) {
        gpa();
    }
    public static void gpa(){
        TestStudent student = new TestStudent();

        System.out.println("Student ID: " + student.getIdNumber());
        System.out.println("Number of credit hours earned: " + student.getNumberOfCreditHours());
        System.out.println("Number of points earned: " + student.getNumberOfPointsEarned());
        System.out.println("Students GPA: " + (student.getNumberOfPointsEarned() / student.getNumberOfCreditHours()));
    }
}
