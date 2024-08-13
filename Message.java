
class Message {

	static void welcome() {
		System.out.println("Welcome to The Bank");
	}
	
	static void tryAgain() {
		System.out.println("Please try again. ");
	}
	
	static void amount() {
		System.out.println("Enter the amount");
	}
	
	static void presentOperation() {
		System.out.println("Enter Your Operation. ");
		System.out.println("0) EXIT");
		System.out.println("1) WITHDRAW");
		System.out.println("2) DEPOSIT");
		System.out.println("3) SHOW INFO");
		System.out.println("4) CHANGE INFO");
	}
	
	static void notEnoughBalance() {
		System.out.println("Balance is not enough. ");
	}
}
