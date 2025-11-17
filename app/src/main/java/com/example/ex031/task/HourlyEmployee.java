package com.example.ex031.task;

public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(int employeeId, String name, double baseSalary, double hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlySalary() {
        return hoursWorked*hourlyRate;
    }
}
