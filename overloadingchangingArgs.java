package perform;

public class overloadingchangingArgs {
	
	
		static int sum(int a,int b)
		{
			return a+b;
		}
		
		static int sum(int x,int y,int z)
		{
			return x+y+z;
		}
		
		public static void main(String args[])
		{
			System.out.println(overloadingchangingArgs.sum(5,6 ));
			System.out.println(overloadingchangingArgs.sum(4,5,6 ));
		}
	}