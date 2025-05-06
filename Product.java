public class Product{
public static String category="Electronics";
public String productName;


public static void main(String[] args){
Product obj1 = new Product();
Product obj2 = new Product();
obj1.productName ="Laptop";
obj2.productName ="Smartphone";
System.out.println("Product" + category);
System.out.println("Product 1:" + obj1.productName);
System.out.println("Product 2:" + obj2.productName);
}
}