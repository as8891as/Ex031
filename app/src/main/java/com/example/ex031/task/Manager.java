package com.example.ex031.task;

public class Manager extends Employee implements BonusEligible {
    private String department;
    private double managementBonusPercentage;

    public Manager(int employeeId, String name, double baseSalary, String department, double managementBonusPercentage) {
        super(employeeId,name,baseSalary);
        this.department = department;
        this.managementBonusPercentage = managementBonusPercentage;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getManagementBonusPercentage() {
        return managementBonusPercentage;
    }

    public void setManagementBonusPercentage(double managementBonusPercentage) {
        this.managementBonusPercentage = managementBonusPercentage;
    }

    @Override
    public double calculateBonus() {
        return getBaseSalary()*managementBonusPercentage;
    }

    @Override
    public double calculateMonthlySalary() {
        return getBaseSalary();
    }

    @Override
    public String toString() {
        return "Manager - " + super.toString();
    }

}
