import java.util.Scanner;

enum Payment {
	MOTORCYCLE(1), SEDAN_CAR(2), MPV_CAR(3), VAN(3);

	private int price;

	private Payment(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}

public class MainPayment {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("1. MOTORCYCLE\n2. SEDAN_CAR\n3. MPV_CAR\n4. VAN\nEnter the choice:  ");
		int x = cin.nextInt();
		String y = null;

		if(x == 1)
			y = "MOTORCYCLE";
		else if (x == 2)
			y = "SEDAN_CAR";
		else if (x == 3)
			y = "MPV_CAR";
		else if (x == 4)
			y = "VAN";
		else
			{System.out.println("**Error!"); System.exit(0);}

		Payment pay = Enum.valueOf(Payment.class, y);

		System.out.println("\nMOTORCYCLE RM1.00 per hour\nSEDAN_CAR RM2.00 per hour\nMPV_CAR RM3.00 per hour\nVAN RM1.00 per hour\n");
		System.out.print("Enter parking hours: ");
		int hour = cin.nextInt();

		float total = hour * pay.getPrice();
		System.out.printf("Total Payment: RM %.2f", total);
		System.out.print("\n");

		pay = null;
		y = null;
		System.gc();
	}
}