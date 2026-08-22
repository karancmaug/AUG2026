import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
		System.out.print("Enter the number to search:");
		int key = sc.nextInt();
		
		int i=0;
		
		while(i<5){
		
		if(arr[i]==key){
			System.out.println("The number "+key+" is found at index " + i);
			break;
			}
		i++;
		}
		if(i==5){
			System.out.println("Not Found");
		}
		
		
	
    }
}
