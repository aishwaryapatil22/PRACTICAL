package inhertance;

public class Student {
int SudId;
String SudName;
Address add;
Student(int StudId, String SudName, Address add){
	this.SudId=SudId;
	this.SudName=SudName;
	this.add=add;
}
void show() {
	System.out.println(SudId+""+SudName);
	System.out.println(add.City+" "+add.Dist+" "+add.Country);

			
}
}
