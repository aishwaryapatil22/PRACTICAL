package inhertance;

 class  Parent_Simple_eg { // parent class
	int marks=85;

}
class Simple_eg  extends  Parent_Simple_eg  {
	int Additional_percentage=5;
	public static void main (String [] args) {
		 Simple_eg obj=new  Simple_eg(); {
			 System.out.println("total marks:"+(obj.marks + obj.Additional_percentage));
		 }
	
}
}