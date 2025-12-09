import java.util.*;
class Vehicle{
    float distance;
    float time;
    float speed;
}
class Car extends Vehicle{
    public float calculate_speed(){
        System.out.println("Enter the value for the distance(car):");
        Scanner sc = new Scanner(System.in);
        this.distance = sc.nextFloat();
        System.out.println("Enter the value for the time(car):");
        this.time = sc.nextFloat();
        this.speed = this.distance/this.time;
        return this.speed;
    }
}
class Bicycle extends Vehicle{
    public float calculate_speed(){
        System.out.println("Enter the value for the distance(bicycle):");
        Scanner sc = new Scanner(System.in);
        this.distance = sc.nextFloat();
        System.out.println("Enter the value for the time(bicycle):");
        this.time = sc.nextFloat();
        this.speed = this.distance/this.time;
        return this.speed;
    }
}
public Class Vehicle{
    public static void vehicle(string[] args){
        Car obj1 = new Car();
        Bicycle obj2 = new Bicycle();
        System.out.println("The car speed:"+ obj1.calculate_speed());
        System.out.println("The bicycle speed:" + obj2.calculate_speed());
    }
}