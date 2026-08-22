import java.util.Scanner;
public class Q2{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number:");
	int x = sc.nextInt();
	
	for(int i=3;i<=x;i=i+3){
	System.out.print(i+" ");
	}
	}
}