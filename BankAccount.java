public class BankAccount{
	String accountName = "John";
	String accountNumber = "450468934";
	double accountaBlanace = "94746.66";
	
	public static void main(String[] args){
		BankAccount bank = new BankAccount();
		System.out.printf("Account name is %s%n",bank.accountName);
		System.out.printf("Account number is %s%n",bank.accountNumber);
		System.out.printf("Account balance is %.2f%n",bank.accountBalance);
		
		bank.withdrawal(5000);
		System.out.printf("Your balance is %.2f%n",bank.accountBalance);
	}
	public double withdrawal(int amount){
		accountBalance -= amount;
		
		return accountBalance;
		
	}
	
	public double deposit(int amount){
		accountBalance += amount;
		
		return accountBalance;
	}
	
}
		