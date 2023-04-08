package inhertance;
public class Single_inhertence {
	public static void main (String [] args) {
		sichild child =new sichild();
		 child.display();
		 child.show();
		
		
	}
}
 class  siparent { // parent class
void show() {
	System.out.println("show details of parent class");
}

}
class 		sichild  extends siparent  {
	void display() {
	
			 System.out.println("displat the result of child class");
		 }
	
}