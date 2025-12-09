class Animal{
    public void makeSound(){
    @override  System.out.println("Time to bark");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Now it's time to bark");
    }
}
public class Main{
    public static void main(String[] args){
        Cat obj2 = new Cat();
        obj2.makeSound();
        Animal obj1 = new Animal();
        obj1.makeSound();
    }
}