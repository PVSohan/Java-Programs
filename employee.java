class Employee{
    public void work(String Name){
        System.out.println("Employees are working successfully");
        System.out.println(Name + "is also the one of the employee working")
    }
    public void getSalary(String Name){
        double salary = 20000.00;
        System.out.println(name +"salary:",salary);
    }
}
class HRManager extends Employee{
    public void work(){
        System.out.println("HR is training the employess related to work");
    }
    public void addEmployee(string Name ){
        system.out.println(Name + "has recruited the employee successfully");
    }
}
public class Main{
    public static void main(string[] args){
        HRManager obj1 = new HRManager();
        obj1.work(Name:"RAJ");
        obj1.getSalary(Name:"RAJ");
        obj2.work();
        obj2.addEmployee(Name:"SOHAN");
    }

}