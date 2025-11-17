package com.example.ex031.task;

public abstract class Employee {
    private final int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateMonthlySalary();

    @Override
    public String toString() {
        return "{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
