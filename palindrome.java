import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int reversed = 0;
        int remainder;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number;

        while (number != 0) {
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

    }

}