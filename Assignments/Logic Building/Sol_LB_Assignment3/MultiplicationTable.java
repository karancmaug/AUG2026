import java.util.Scanner;

public class MultiplicationTable{
	static void printMultiplicationTable(int n){
		for(int i=1;i<11;i++){
			System.out.println(n +" x " + i +" = " + n*i);
		}
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		printMultiplicationTable(x);
	}
}