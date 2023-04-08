public class multi1 {//main class
		public static void main(String[] args) {
			child1 obj = new child1(); //create a object of class
			obj.run();
			}
	}

	class parent1 { //parent class
		void run() { //parent class user define method
			System.out.println("parent1 run method");		
		}
	}

	class parent2 { //parent class
		void run() { //parent class user define method
			System.out.println("parent2 run method");		
		}
	}
	
	class child1 extends parent1,parent2 { //child class

}