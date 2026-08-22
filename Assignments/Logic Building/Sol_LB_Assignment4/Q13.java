import java.util.Scanner;
import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[5];

        System.out.print("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search:");
        int key = sc.nextInt();
        System.out.println(Arrays.asList(arr).contains(key) ? "Found" : "Not Found");

    }
}
