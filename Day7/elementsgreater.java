
import java.util.Scanner;

public class elementsgreater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cpy = new int[n];
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] > temp) {
                temp = arr[i];
                cpy[i] = temp;
            }
        }
        for (int i : cpy) {
            if (i != 0) {
                System.out.println(i + " ");
            }
        }
    }
}
