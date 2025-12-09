import java.util.*;

class Shapes{
    float Area;
    float Perimeter;
}
Shapes(Area,Perimeter){
    this.Area=Area;
    this.Perimeter=Perimeter;
}
class Circle extends Shapes{
    float radius;
}
Circle(float radius){
    this.radius = radius;
    this.Area = (float)math.pi.pow(radius,2);
    this.Perimeter = (float)2*math.pi*radius;
}    
    

class Rectangle extends Shapes{
    float length;
    float breadth;
}
Rectangle(float length,float breadth){
    this.length;
    this.breadth;
    this.Area = length*breadth;
    this.Perimeter = 2*(length + breadth);
}
class Triangle extends Shapes{
    float s1,s2,s3;
    float b,h;
}
Triangle(float s1,float s2,float s3,float b,float h){
    this.s1 = s1;
    this.s2 = s2;
    this.s3 = s3;
    this.b = b;
    this.h = h;
    this.Perimeter = s1+s2+s3;
    this.Area = 1/2*(b*h); 
}      
class Square extends Shapes{
    float side;
}
Square(float side){
    this.side = side;
    this.Area = side*side;
    this.Perimeter = 4*side;    
}
public class hierarchy{
    public static void main(string[]args){
        Sysytem.out.println("Enter the number:")
        Scanner sc =new Scanner(system.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Enter the value for circle:");
            Scanner sc = new scanner(system.in);
            float radius = sc.nextFloat();
            Circle c = new Circle(float radius);
            System.out.println("The area of a circle:"+c.Area);
            System.out.println("The perimeter of a circle:"+c.Perimeter);
        
            case 2:
            System.out.println("Enter the value for rectangle:");
            Scanner sc = new scanner(system.in);
            float length = sc.nextFloat();
            float breadth = sc.nextFloat();
            Rectangle r = new Rectangle(float length,float breadth);
            System.out.println("The area of rectangle:"+r.Area);
            System.out.println("The perimeter of rectangle:"+r.Perimeter);
        
            case 3:
            System.out.println("Enter the value for triangle:");
            Scanner sc = new scanner(system.in);
            float s1 = sc.nextFloat();
            float s2 = sc.nextFloat();
            float s3 = sc.nextFloat();
            float b = sc.nextFloat();
            float h = sc.nextFloat();
            Triangle t = new Triangle(float s1,float s2,float s3,float b,float h);
            System.out.println("The area of triangle:"+t.Area);
            System.out.println("The perimeter of triangle:"+t.Perimeter);

            case 4:
            System.out.println("Enter the value for square:");
            Scanner sc = new scanner(system.in);
            float side = sc.nextFloat();
            Square s = new Square(float side);
            System.out.println("The area of a square:"+s.Area);
            System.out.println("The perimeter of a square:"+s.Perimeter);

            default:
            System.out.println("INVALID STATEMENT!");
        }

    }
}