package Abstraction;

abstract class TestAbs { //abstract class ---parent class
	abstract void display();//abstract method 
}

class demo1 extends TestAbs { //1st child class
	//abstract method of parent class
	void display() {
		System.out.println("demo1 method invoked");
	}
}

class demo2 extends TestAbs { //2nd child class
	//abstract method of parent class
	void display() {
		System.out.println("demo2 method invoked");
	}
}

public class AbstractMethod {
	public static void main(String[] args) {
		demo1 child1=new demo1();
		demo2 child2=new demo2();
		child1.display();
		child2.display();
	}

}
