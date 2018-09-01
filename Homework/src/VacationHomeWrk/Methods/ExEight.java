package VacationHomeWrk.Methods;

import java.util.Scanner;
////////////////////////////// Exercise 8 /////////////////////////////////////////////
public class ExEight {
    Employee empOne;
    Employee empTwo;

    private class Employee {
        String firstName;
        String lastName;
        double salary;

        public Employee(String firstName, String lastName, Double salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = setSalary(salary);
        }

        private double setSalary(double salary) {
            if (salary < 0) {
                return 0;
            } else {
                return salary;
            }
        }
    }

    public void setEmployees() {
        setObject(empOne);
        setObject(empTwo);
    }

    private void setObject(Employee emp) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Input the Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Input the Yearly Salary amount: ");
        double salary = scanner.nextDouble();
        emp = new Employee(firstName, lastName, salary);
        printObject(emp);
    }

    private void printObject(Employee emp) {
        System.out.println("First name: " + emp.firstName);
        System.out.println("Last name: " + emp.lastName);
        System.out.println("Yearly salary: " + emp.salary);
        System.out.println("Increased yearly salary by 10%: " + emp.salary * 1.1 + "\n");
    }
}