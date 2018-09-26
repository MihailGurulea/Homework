public class Main {
    public static void main(String[] args) {
        Student student = new Student("Mihail", "Alba Iulia str.",
                "Day", 2, 55000.00);
        Staff staff = new Staff("Dinu", "Gheorghe Ureche str.",
                "Onisifor Ghibu", 10500);

        System.out.println(student.toString());
        System.out.println(staff.toString());

    }
}
