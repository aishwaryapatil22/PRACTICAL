package perform;

public class Publisher {
	
    String name;
    String id;
    String city;

   public Publisher(String name, String id, String city) {
       this.name = name;
       this.id = id;
       this.city = city;
   }
   void print() {
  	 System.out.println("---------------------Author Details------------------------");
  	System.out.println("Publisher Name:"+name);
  	System.out.println(("Publisher ID:"+id));
  	System.out.println("Publisher City:"+city);
  }
}