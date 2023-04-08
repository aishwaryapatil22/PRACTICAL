package com.cognizant.tax;

public class TaxCalculator {
    private boolean citizenship;
    private double basicSalary;
    private double taxAmount;
    private double netSalary;

    // parameterized constructor
    public TaxCalculator(boolean citizenship, double basicSalary) {
        this.citizenship = citizenship;
        this.basicSalary = basicSalary;
    }

    // getters and setters
    public boolean isCitizenship() {
        return citizenship;
    }

    public void setCitizenship(boolean citizenship) {
        this.citizenship = citizenship;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    // method to calculate tax
    public void calculateTax() {
        if (basicSalary <= 250000) {
            taxAmount = 0;
        } else if (basicSalary <= 500000) {
            taxAmount = (basicSalary - 250000) * 0.05;
        } else if (basicSalary <= 1000000) {
            taxAmount = (basicSalary - 500000) * 0.2 + 12500;
        } else {
            taxAmount = (basicSalary - 1000000) * 0.3 + 112500;
        }
        netSalary = basicSalary - taxAmount;
    }

    // method to deduct tax
    public void deductTax(double amount) {
        netSalary -= amount;
    }

    // method to validate salary and citizenship
    public void validateSalary() {
        if (citizenship && basicSalary > 100000) {
            System.out.println("The salary and citizenship eligibility: true");
        } else {
            System.out.println("The salary and citizenship eligibility: false");
        }
    }
}
