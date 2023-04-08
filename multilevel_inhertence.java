package inhertance;

public class multilevel_inhertence {
	public static void main (String [] args) {
		sichild2 child =new sichild2();
		child.show();
	
		child.print();
		
	}

}
class siparent1 {
	void show() {
		System.out.println("show the detail of parent class");
	}
}

class sichild2 extends siparent1 {
	void print() {
		System.out.println("print output of child class2");
	}
}
