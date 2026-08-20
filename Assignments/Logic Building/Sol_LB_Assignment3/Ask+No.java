import java.util.Scanner;
public class AskpNo{
	
	static int askForPositiveNumber(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Positive no:");
		int x=sc.nextInt();
		do{
		System.out.println("Enter a Positive no:");
		int x=sc.nextInt();
		}while(x<=0)
		return x;
		
	}
	
	public static void main(String[] args){
	
	int y=askForPositiveNumber();
	
	System.out.println("You entered a positive number: "+ y); 
	
	}
	
}