public class Car{
public static String companyName=("Honda");
public String carModel;


public static void main(String[] args){
System.out.println(Car.companyName);
Car obj1 = new Car();
Car obj2 = new Car();
obj1.carModel ="civic";
obj2.carModel ="Accord";
System.out.println("Car 1 Model:" + obj1.carModel);
System.out.println("Car 2 Model:" + obj2.carModel);
}
}