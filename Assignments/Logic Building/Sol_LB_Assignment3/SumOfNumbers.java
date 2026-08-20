import java.util.Scanner;

public class SumOfNumbers{
	static int calculate(int n){
		int sum=0;
		for(int i=1;i<n+1;i++){
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		System.out.println("The sum of numbers from 1 to " + x +" is: " + calculate(x));
	}
}