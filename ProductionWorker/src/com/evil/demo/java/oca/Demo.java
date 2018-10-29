package com.evil.demo.java.oca;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        ProductionWorker worker = new ProductionWorker("Mihail", "999-A",date,1,8.50);
        ShiftSupervisor supervisor = new ShiftSupervisor("Nicoleta", "777-B",date,8000.00,16000.00);

        System.out.println(worker.toString());
        System.out.println(supervisor.toString());

    }
}
