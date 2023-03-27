package access_mod;

class Test {
	private int a=10;
	private void display() {
		System.out.println("private method ");
	}
}
	public class private_am{
		public static void main(String [] args) {
			Test obj=new Test();
	System.out.println(obj.a);
			obj.display();
		
		
	
	}

}
