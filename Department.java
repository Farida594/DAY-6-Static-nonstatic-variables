public class Department{
public static String departmentName="HR";
public String employeeName;


public static void main(String[] args){
Department obj1 = new Department ();
Department obj2 = new Department();
System.out.println("Deparment:"+departmentName );
obj1.employeeName ="John";
obj2.employeeName ="Alice";
System.out.println("Employee1:" + obj1.employeeName);
System.out.println("Employee2:" + obj2.employeeName);
Department.departmentName ="Marketing";
System.out.println("Deparment:"+departmentName );
System.out.println("Employee1:" + obj1.employeeName);
System.out.println("Employee2:" + obj2.employeeName);


}
}