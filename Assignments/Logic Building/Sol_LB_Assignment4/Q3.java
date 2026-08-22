import java.util.Scanner;
public class Q3{
	static int factorial(int n){
		return (n==1)?1:n*factorial(n-1);
	}
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number:");
	int x = sc.nextInt();
	
	
	System.out.print("Factorial of "+ x +" is "+ factorial(x));
	
	}
}