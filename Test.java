import java.util.Scanner;

class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Message.welcome();
		User user = new User("Furkan");
		
		while (Banka.getPermission()) {
			Message.presentOperation();
			Offers.makeOffer(Offers.OfferFromValue(Offers.takeOffer(input)), user);
			System.out.println(Banka.getCustomerCount());
		}

	}

}
