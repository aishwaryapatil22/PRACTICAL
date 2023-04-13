package Abstraction;

abstract class ParentAbs {
	ParentAbs () { //constructor
		System.out.println("no-args constructor");
	}
	abstract void show(); //abstract method
	void run() { //non abstract
		System.out.println("non abstract method");
	}
}

class ChildAbs extends ParentAbs {
	@Override
	void show() {
		System.out.println("Parent class abstract method");
	}
}

public class AbstractClassEg {
	public static void main(String[] args) {
		ParentAbs obj=new ChildAbs();
		obj.show();
		obj.run();
	}
}
