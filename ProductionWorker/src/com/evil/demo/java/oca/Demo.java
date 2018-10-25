package com.evil.demo.java.oca;

public class Demo {
    public static void main(String[] args) {
        ProductionWorker worker = new ProductionWorker("Mihail", "999-A","19/04/2005",1,8.50);
        ShiftSupervisor supervisor = new ShiftSupervisor("Nicoleta", "777-B","20/10/1988",8000.00,16000.00);

        System.out.println(worker.toString());
        System.out.println(supervisor.toString());

    }
}
