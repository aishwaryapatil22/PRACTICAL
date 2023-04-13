package Abstraction;

abstract class BANK {
	abstract int RateOfInterest();
}

class RBI extends BANK {
	int RateOfInterest() {
		return 7;
	}
}

class SBI extends BANK {
	int RateOfInterest() {
		return 8;
	}
}

class BOI extends BANK {
	int RateOfInterest() {
		return 9;
	}
}

class PNB extends BANK {
	int RateOfInterest() {
		return 6;
	}
}

public class Abstract_RateOfInterest {
	public static void main(String[] args) {
		BANK bank;
		bank=new BOI();
		System.out.println(bank.RateOfInterest());
		
	}
	

}
