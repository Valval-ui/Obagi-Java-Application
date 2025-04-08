import java.util.Scanner;



public class MethodOverLoading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate Perimter of different shapes");
		System.out.println("Enter 1 To calculate perimter of a Square");
		System.out.println("Enter 2 To calculate perimter of a Rectangle");
		System.out.println("Enter 3 To calculate perimter of a Circle");
		System.out.println();
		
		
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			{
				System.out.print("Enter the length of the square: ");
				int lengthOfSquare = input.nextInt();
				
				MethodOverLoading.shape(lengthOfSquare);
			}
			break;
			
			case 2:
			{
				System.out.print("Enter the length of the rectangle: ");
				int lengthOfRectangle = input.nextInt();
				
				System.out.print("Enter the breadth of the rectangle: ");
				int breadthOfRectangle = input.nextInt();
				
				MethodOverLoading.shape(lengthOfRectangle,breadthOfRectangle);
				
			}
			break;
			
			case 3:
			{
				System.out.print("Enter the radius of the circle: ");
				double radiusOfCircle = input.nextDouble();
				
				MethodOverLoading.shape(radiusOfCircle);
			}
			break;
			default:
			System.out.println("Invalid input");
		}
		
		
		
		
	}
	
	public static void shape(int length){
		int PerimterOfSquare = 4 * length;
		
		System.out.printf("The perimter of square is %d%n",PerimterOfSquare);
	}
	
	public static void shape(int length, int breadth){
		int perimterOfRectangle = 2 * (length + breadth);
		
		System.out.printf("The perimter of a rectangle is %d%n",perimterOfRectangle);
	}
	
	public static void shape(double radius){
		double perimterOfCircle = 2 * Math.PI * radius;
		
		System.out.printf("The perimter of Circle is %f%n",perimterOfCircle);
	}	
}
