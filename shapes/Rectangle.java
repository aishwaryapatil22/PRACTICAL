package com.cognizant.shapes;

public class Rectangle {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        System.out.println("The Area of the rectangle is calculated using the formula length * breadth");
    }
}
