package inhertance;




class A {
	void print() {
	System.out.println("The class A.");
}}

class B extends A {
	void show() {
        System.out.println("The class B.");
    }}

class C extends B {
	void display() {
	System.out.println("The class C.");
}}

public class main {
	public static void main(String[] args) {
		C c= new C();
		c.print(); 
        c.show(); 
        c.display();
	}

}