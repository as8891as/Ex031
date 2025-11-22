package com.example.ex031.task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(new HourlyEmployee(123,"Eric",8000,27,1.02));
        allEmployees.add(new HourlyEmployee(456,"Berry",12000,30,1.05));
        allEmployees.add(new HourlyEmployee(671,"Jessica",8200,28,1.03));
        allEmployees.add(new Manager(789,"Courtney",16000,"Budget",1.25));
        allEmployees.add(new Salesperson(519,"Jack",8500,13000,5));

        for (Employee employee : allEmployees) {
            System.out.println(employee);
            System.out.println(employee.calculateMonthlySalary());
        }

        double totalBonuses = 0;

        for (Employee employee : allEmployees) {
            if (employee instanceof BonusEligible) {
                totalBonuses += ((BonusEligible) employee).calculateBonus();
            }
        }
        System.out.println("The sum of bonuses is: "+totalBonuses);
    }
}
