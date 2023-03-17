class nestedif{
public static void main(String[] args){
String address="kolkata,india"; 

if(address.endSwith("india"))
{
if (address.contains("delhi")){
System.out.println("city delhi");
}
else if(address.contains("mumbai")){
System.out.println("city mumbai ");
}

else {
System.out.println(address.split(",")[0]);
}
}
else{
System.out.println("not living in india");
}
}
}