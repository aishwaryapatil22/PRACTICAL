package Array;

public class Array_eg1 {
public static void main(String [] args) {
	int a[]=new int[5];
	a[0]=2;
	a[1]=9;
	a[2]=5;
	a[3]=7;
	a[4]=1;
	// taversing an array using for loop each
	for(int i:a)
		System.out.println(i);
	for(int i=0;i<a.length;i++)
System.out.println(a[i]);
	
}
}
