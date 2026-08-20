import java.util.Scanner;

public class SumOfTwo {

	static int sumOfTwoNo(int a, int b) {
		return (a + b);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number:");
		int x = sc.nextInt();
		System.out.println("Enter the second number:");
		int y = sc.nextInt();
		System.out.println("The sum of " + x + " and " + y + " is " + sumOfTwoNo(x, y));
		sc.close();
	}

}