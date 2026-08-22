import java.util.Scanner;
public class Q5{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number:");
	int x = sc.nextInt();
	int sum =0;
	for(int i=1;i<=x;i++){
	if(i%2!=0){
	sum = sum + i;
	
	}
	
	}
	System.out.print("The sum of odd numbers from 1 to "+x+" is: "+sum);
	}
	
}