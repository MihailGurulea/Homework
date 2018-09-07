package VacationHomeWrk.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", "Doe", 1500.0);
        Employee e2 = new Employee("Vasea", "Pupkin", -500.0);

        double annualSalary1 = e1.getMonthlySalary() * 12;
        double annualSalary2 = e2.getMonthlySalary() * 12;

        e2.setMonthlySalary(-500);

        System.out.println(annualSalary1 + "      " + annualSalary2);
    }
}
