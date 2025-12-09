import java.util.Scanner;
class main{
   public static void main(String[]args){
           Scanner sc = new Scanner(System.in);
System.out.println("Enter the length value:");
Float l = sc.nextFloat();
System.out.println("Enter the breadth value:");
Float b = sc.nextFloat();
Float Area = l*b;
System.out.println("Area of rectangle:"+Area);
        }
}
