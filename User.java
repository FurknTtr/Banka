import java.util.Scanner;

class User implements Actionable {
	private String name;
	private int ID;
	private int balance;
	
	User(String name){
		this.name = name;
		ID = Banka.getCustomerCount();
		balance = 0;
	}

	@Override
	public void withdraw(int amount) {
		if(amount <= balance) {
			balance -= amount;
		}
		else Message.notEnoughBalance();
		
	}

	@Override
	public void deposit(int amount) {
		balance += amount;
	}

	@Override
	public void showInfo() {
		System.out.println("Name: "+name);
		System.out.println("Balance: "+balance);
		
	}

	@Override
	public void changeInfo() {
	}
	
	int getBalance() {
		return balance;
	}
}
