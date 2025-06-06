
import java.util.Scanner;

public class primenumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        System.out.println("Enter a  value of n");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % 2 == 0) {
                temp = 1;

                if (temp == 1) {
                    System.out.println("Enter not prime number");

                } else {
                    System.out.println("Enter a prime number");
                }
            }
        }

    }

}
