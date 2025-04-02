import java.util.Scanner;


public class Accept10Numbers{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		
		
		System.out.println("Enter 10 numbers:");
		for(int i = 0; i < 10; i++){
			numbers[i] = scanner.nextInt();
			
			
			
		}
		int sum6 to sum8 =numbers[6] + numbers[7] + numbers[8];
		int sum4 to sum9 =numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8] + numbers[9];
        int result = numbers[6]	-(sum6 to sum8	+ sum4 to sum9);
		
		System.out.println("Result: " ,result);
	}
}