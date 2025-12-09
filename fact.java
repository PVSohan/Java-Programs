import java.util.Scanner;

class fact{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial:");
        int x = sc.nextInt();
        int fact = 1;
        if(x > 0){
            for(int i=1; i<=x; i++){
                fact = fact*i;
            }
            System.out.println("the factorial of the number is : " + fact);
        }else{
            System.out.println("Invalid number");
        }
    }
}

      
            
