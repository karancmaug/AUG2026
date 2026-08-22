import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 integers");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = 0;
		int neg = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                pos++;
            }
			if (arr[i] < 0) {
                neg++;
            }
			
        }
        System.out.println("Positive num:"+ pos);
		System.out.println("NEgative num: " + neg);

    }
}
