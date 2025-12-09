import java.util.Scanner;

class temperature {
      public static void Main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the temperature:");
            double temp = sc.nextInt();
            System.out.println("Enter the choice:");
            int choice = sc.nextInt();
            if (choice == 1) {
                  System.out.println("------celcius----to------Fahrenhit----");
                  double F = temp * (1.8) + 32;
                  System.out.printf("The obtained temperature in degree F: " + F);
            } else if (choice == 2) {
                  System.out.println("-------Fahrenhit--to----celcius-----");
                  double c = temp * (0.556) - 32;
                  System.out.printf("The obtained temperatture in degree celcius : " + c);
            } else {
                  System.out.println("Invalid choice");
            }
      }
}