import java.util.Scanner;


public class SwitchStatement{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter *131# To Subscribe Data");
		System.out.println("Enter *303# To borrow data");
		System.out.println("Enter *310# To check data balance");
		
		
		String code = input.nextLine();
		
		switch(code){
			
			
			
			case "*131#":
			{
				System.out.println("Enter 1 for 1 month subscription");
		        System.out.println("Enter 2 for 2 month subscription");
				System.out.println("Enter 3 for 3 month subscription");
				System.out.println("Enter 4 for 4 month subscription");
				
				
				Int option = input.nextInt();
				
				switch(option){
					case 1:
					{
					System.out.println("Your 1 month subscription has been activated");
					}
					break;
					
					case 2:
					{
					System.out.println("Your 2 month subscription has been activated");
					}
					break;
					
					case 3:
					{
					System.out.println("Your 3 month subscription has been activated");
					}
					break;
					
					
					case 4:
					{
					System.out.println("Your 4 month subscription has been activated");
					}
					break;
					
					
					 
				
				