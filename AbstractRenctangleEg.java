package Abstraction;

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
    
    double areaOfRectangle() {
        return length * width;
    }
    
    double perimeterOfRectangle() {
        return 2 * (length + width);
    }
}
abstract class Rectangle {
    double length;
    double width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    abstract double areaOfRectangle();
    
    abstract double perimeterOfRectangle();
}

public class AbstractRenctangleEg {
	public static void main(String[] args) {
		Rectangle rectangle = new Square(5.2);
        System.out.println("Area of Rectangle: " + rectangle.areaOfRectangle());
        System.out.println("Area of Perimeter: " + rectangle.perimeterOfRectangle());
	}

}
