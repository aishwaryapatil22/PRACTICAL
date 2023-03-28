public class const_overload {
    int age;
    String names;
    String ages;
   String address;
    
    const_overload ( int a, String n) {
       names = n;
        ages =a;
      
    }
           const_overload ( int a, String n,String ad) {

       names = n;
        ages =a;
     address=ad;
}




    
    public void show() {
        
            System.out.println("Name= " + names + ", Age= " + ages + ", address " + adress);
        }
public static void main(String[] args){
const_overload on=new const_overload (25,"rajesh");
const_overload ob2=new const_overload (30, "aish",solapur);
ob.show();
ob2.show();
    }
}
