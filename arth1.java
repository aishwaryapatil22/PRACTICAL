package inhertance;

class arth {
	 public int add(int a, int b) {
	        return a + b;
	    }
	}

	class Adder extends arth {
	    // This class inherits the add method from Arithmetic
	}

	public class arth 1{
	    public static void main(String[] args) {
	        Adder adder = new Adder();
	        int sum = adder.add(21, 50);
	        System.out.println("The Sum is: " + sum);
	    }	
}