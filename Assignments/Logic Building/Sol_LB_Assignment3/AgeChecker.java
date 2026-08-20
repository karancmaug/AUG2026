import java.util.Scanner;
public class AgeChecker{
	
	static String AgeCategory(int age){
		return (age>60)?"Senior Citzen":(age>18)?"Adult":"Minor";
	}
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your age:");
		
		int x= sc.nextInt();
		
	if(AgeCategory(x)=="Adult"){
		System.out.println("You are an Adult");
	}else{
	System.out.println("You are a "+AgeCategory(x));
}}}
