package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        performOperations();
    }

    private static void performOperations() {

        Healthplan healthplan1 = new Healthplan(1, "Doğukan", Plan.BASIC);
        System.out.println(healthplan1);


        Employee employee1 = new Employee(2,"samet","samet@workintech.com","1234Samet",new String[] {"d"});
        employee1.addHealthPlan(0, healthplan1.getName());
        System.out.println(employee1);


        Company company = new Company(1,"dogu",12222,new String[]{"a"});
        company.addEmployee(1,"d");
        System.out.println(company);
    }
}