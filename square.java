package perform;

public class square {
    int Length;

    public square(int sideLength) {
        this.Length = sideLength;
    }

    public int getArea() {
        int area = Length * Length;
        return area;
    }

    public int getPerimeter() {
        int perimeter = 4 * Length;
        return perimeter;
    }

    public static void main(String[] args) {
        square square = new square(8);
        int area = square.getArea();
        int perimeter = square.getPerimeter();
        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);
    }
}



