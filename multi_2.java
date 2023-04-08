package inhertance;
//multilevel inhertence
 class multi2 {//Parent class A
	 void running() {
		 System.out.println("running mode on");
	 }}
 class car extends multi2 { // child class B whose parent class is vehicle 
		void run() {
			System.out.println("car run mode on");
		}
	}

	class mustang extends car { // child class c whose parent class is vehicle
		void speed() {
			System.out.println("speed is very high");
		}
	}

	public class  multi_2{
	void main(String[] args) {
			mustang d = new mustang(); //creating obj
			d.running();
			d.run();
			d.speed();
		}
	}