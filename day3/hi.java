
import java.util.Scanner;

public class hi2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        scanner.close();

        int largest = Math.max(Math.max(num1, num2), num3);

        System.out.println("The largest number is: " + largest);
    }
}
