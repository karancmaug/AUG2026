public class Q17{
	public static void main(String[] args){
		for(int i =1;i<10;i=i+2){
			for(int j=1;j<i+1;j=j+2){
				System.out.print(j);
				if(j<i){
					System.out.print("*");
			
				}
			}
			System.out.println();
		}
	}
}