class Datatype_test{
int a;
short b;
long c;
char m;
double g;
float h;
void show(){
System.out.println("int" +a);
System.out.println("short" +b);
System.out.println("long" +c);
System.out.println("char" +m);
System.out.println("double" +g);
System.out.println("float" +h);
}

public static void main (String args[]){
Datatype_test object=new Datatype_test();
System.out.println("THE DEFAULT VALUES ARE GIVEN BELOW:");
object.show();
}
}