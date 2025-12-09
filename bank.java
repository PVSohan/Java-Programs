import java.util.Scanner;

class BankAccount {
    public float Deposit() {
        System.out.println("Enter the amount to deposit:");
        Scanner sc = new Scanner(System.in);
        float deposit = sc.nextFloat();
        System.out.println("The amount you deposited is:" + deposit);
    }

    public float Withdrawal() {
        System.out.println("Enter the amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float withdraw = sc.nextFloat();
        System.out.println("The amount you withdraw is" + withdraw);
    }
}

public class bank {
    public static main(String[] args) {
        BankAccount obj = new BankAccount();
        System.out.println("Your transaction is completed successfully:" + obj.Withdrawal() + obj.Deposit());
    }
}