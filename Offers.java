import java.util.Scanner;

enum Offers {
	EXIT, WITHDRAW, DEPOSIT, SHOWINFO, CHANGEINFO;

	static int takeOffer(Scanner input) {
		return input.nextInt();
	}

	static Offers OfferFromValue(int value) {
		for (Offers offer : Offers.values()) {
			if (offer.ordinal() == value) {
				return offer;
			}
		}
		Message.tryAgain();
		return OfferFromValue(takeOffer(new Scanner(System.in)));
	}

	static int takeAmount(Scanner input) {
		Message.amount();
		int amount = input.nextInt();
		if (amount <= 0)
			return takeAmount(input);
		else
			return amount;
	}

	static void makeOffer(Offers x, User user) {
		switch (x) {
		case EXIT:	Banka.exitPermission();  break;
		case WITHDRAW: Action.actionWithdraw(user);  break;
		case DEPOSIT: Action.actionDeposit(user);	break;
		case SHOWINFO: user.showInfo();	break;
		case CHANGEINFO:	break;
		default:
			System.out.println("Yeni bakiye: "+ user.getBalance());
		}
	}
}
