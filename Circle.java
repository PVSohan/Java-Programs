import java.util.*;

public class Circle{
    float radius;
    float area;
    float circum;
    public void area_circle(){
        Scanner scanner =new Scanner(System.in);
        float radius = scanner.nextFloat();
        float area= (float)(Math.PI*Math.pow(radius,2));
        System.out.println("The area of circle: "+area);
    }
    public void circumferance(){
        Scanner scanner = new Scanner(System.in);
        float radius = scanner.nextFloat();
        float circum = 2*Math.PI*radius;
        System.out.println("The circumference of circle:"+circum);
    }
    


    public static Void main(string[] args){
        Circle obj = new Circle();
        obj.area_circle();
        obj.circumferance();
        
    }
}

    
