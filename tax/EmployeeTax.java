package com.cognizant.tax;

public class EmployeeTax {
    public static void main(String[] args) {
        // Test Case 1
        TaxCalculator taxCalc1 = new TaxCalculator(true, 25000);
        taxCalc1.calculateTax();
        taxCalc1.deductTax(7500);
        taxCalc1.validateSalary();
        System.out.println("The Tax of the employee for the " + taxCalc1.getBasicSalary() + " is " + taxCalc1.getTaxAmount());
        System.out.println("The nett salary of the employee " + taxCalc1.getNetSalary());

        System.out.println();

        // Test Case 2
        TaxCalculator taxCalc2 = new TaxCalculator(true, 125000);
        taxCalc2.calculateTax();
        taxCalc2.deductTax(37500);
        taxCalc2.validateSalary();
        System.out.println("The Tax of the employee for the " + taxCalc2.getBasicSalary() + " is " + taxCalc2.getTaxAmount());
        System.out.println("The nett salary of the employee " + taxCalc2.getNetSalary());
    }
}
