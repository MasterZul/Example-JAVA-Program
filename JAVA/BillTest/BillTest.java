import java.util.Scanner;

class Bill {
	private int airtime, totalSms;
	private final double callrate = 0.25;
	private final double smsrate = 0.05;

	public Bill(int x, int y) {
		airtime = x;
		totalSms = y;
	}

	public Bill calculateTotal(Bill q, Bill r) {
		Bill obj = new Bill(0, 0);

		obj.airtime = r.airtime + q.airtime;
		obj.totalSms = r.totalSms + q.totalSms;

		return obj;
	}

	public void calculateBill() {
		double total = airtime * callrate + totalSms * smsrate;
		System.out.println(total);
	}
}

public class BillTest {
	public static void main(String[] args) {
		Bill mum = new Bill (130, 100);
		Bill sister = new Bill (200, 50);
		Bill family = new Bill (0, 0);

		family = family.calculateTotal(mum, sister);
		System.out.println("Total bill: ");
		family.calculateBill();
	}
}