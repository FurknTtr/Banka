import java.util.Scanner;

class Action {
	
	private static int amount;
	
	static void setAmount() {
		amount = Offers.takeAmount(new Scanner(System.in));
	}
	
	static void actionWithdraw(User user) {
		setAmount();
		user.withdraw(amount);
		Banka.withdraw(amount);
	}
	
	static void actionDeposit(User user) {
		setAmount();
		user.deposit(amount);
		Banka.deposit(amount);
	}

}
