import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];

        System.out.print("Enter 5 strings: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.next();
        }

        for (String num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
