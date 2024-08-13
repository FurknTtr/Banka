
abstract class Banka {
	private static final String BankName="Furkan Bank";
	private static boolean permission = true;
	private static int customerCount = 0;
	private static int totalMoney = 10000;
	protected static Banka[] bankCustomer = new Banka[20];
	
	static boolean getPermission() {
		return permission;
	}
	
	static void exitPermission() {
		permission = false;
	}
	
	static void withdraw(int amount) {
		if( totalMoney >= amount) {
			totalMoney -= amount;
		}
		else Message.notEnoughBalance();
	}
	
	static void deposit(int amount) {
		totalMoney += amount;
	}
	
	static void showInfo() {
		System.out.println("Bank Name: "+ BankName);
		System.out.println("The Total Money Of Bank: "+ totalMoney);
		System.out.println("Customer Count Of Bank: "+ customerCount);
	}
	
	static int getCustomerCount() {
		customerCount++;
		return customerCount--;
	}
	
	
}
