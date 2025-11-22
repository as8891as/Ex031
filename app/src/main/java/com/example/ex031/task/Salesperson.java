package com.example.ex031.task;

public class Salesperson extends Employee implements BonusEligible {
    private double salesCommission;
    private double totalSales;

    public Salesperson(int employeeId, String name, double baseSalary, double salesCommission, double totalSales) {
        super(employeeId,name,baseSalary);
        this.salesCommission = salesCommission;
        this.totalSales = totalSales;
    }

    public double getSalesCommission() {
        return salesCommission;
    }

    public void setSalesCommission(double salesCommission) {
        this.salesCommission = salesCommission;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    @Override
    public double calculateBonus() {
        return totalSales*0.05;
    }

    @Override
    public double calculateMonthlySalary() {
        return getBaseSalary()+(totalSales*salesCommission);
    }

    @Override
    public String toString() {
        return "Salesperson - " + super.toString();
    }
}
