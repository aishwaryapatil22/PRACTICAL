public class Parameterizedcons {
int age;
String name;
// parameters pass 
Parameterizedcons(int a, String n) {
age=a;
name = n;
}

void show() {
System.out.println(age+ " " +name);}
public static void main(String[] args){
Parameterizedcons  d=new Parameterizedcons(20, " aishwarya");
Parameterizedcons  d1=new Parameterizedcons(30, " sweety");
Parameterizedcons  d2=new Parameterizedcons(40, " neha");
d.show();
d1.show();
d2.show();
}
}

create a class with both the constructor where you can show the details of 5 employee