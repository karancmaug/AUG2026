import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 integers");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0 ;
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i] ;
        }
		double avg = sum/5;
        System.out.println("The average is " + avg);

    }
}
