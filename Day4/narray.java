
import java.util.Scanner;

public class narray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int num = sc.nextInt();
        int i = 0, a, b, c;
        System.out.print("Enter a index value");
        i = sc.nextInt();
        int arr[] = new int[i];
        System.err.println("Enter array value");
        for (a = 0; a < i; a++) {
            arr[a] = sc.nextInt();
        }
        for (c = 0; c < i; c++) {
            if (arr[c] == num) {
                System.err.println("the given number is present in" + c);
            }
        }

    }

}
