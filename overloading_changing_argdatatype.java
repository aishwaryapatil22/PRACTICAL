package perform;

public class overloading_changing_argdatatype {
	static int sum(int a,int b)
	{
		return a+b;
	}
	
	static double sum(double a,double b) {
	
		return a+b;
	}
	
	public static void main(String args[])
	{
		System.out.println(overloading_changing_argdatatype.sum(5,6 ));
		System.out.println(overloading_changing_argdatatype.sum(5.,6.3 ));
	}
}


