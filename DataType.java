public class DataType{
	public static void main(String[] args){
		//Integer type (byte,short,int,long0
		byte age = 50;
		System.out.printf("You are %d years old%n",age);
		
		short quantity = 20000;
		System.out.printf("I bought %d quantity of bags for my business%n",quantity);
		
		int populationInNigeria = 1000000000;
		System.out.printf("The population in Nigeria is %d%n",populationInNigeria);
		
		long worldPopulation = 8000000000L;
		System.out.printf("The world population is %d%n",worldPopulation);
		
		//float-point numbers(float, double)
		float weight = 5.6F;
		System.out.printf("The bag of rive was %.1fkg%n",weight);
		
		double acctBalance = 487575.949543;
		System.out.printf("Your account balance is %c%.2f%n",'$',acctBalance);
		
		//Boolean type(boolen)
		boolean isJavaFun = true;
		System.out.printf("Is Java Fun? %b%n",isJavaFun);
		
		//Charater type(char)
		char alpha = '@';
		System.out.printf("My email is layefatam%cgmail.com",alpha);
	}
}