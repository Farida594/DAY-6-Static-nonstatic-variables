public class Computer{
public static String os="Window";
public String ram;
public static void main(String[] args){
System.out.println("os:"+Computer.os);
Computer com1=new Computer();
com1.ram="8GB";
System.out.println("Computer 1 Ram :"+com1.ram);
Computer com2=new Computer();
com2.ram="16GB";
System.out.println("Computer 2 RAM:"+com2.ram);
}
}