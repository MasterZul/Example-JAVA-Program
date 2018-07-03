abstract class Card {
	private String recipient;
	public abstract void greeting();

	Card(String r)
	{recipient = r;}

	public void setRecp(String x) {
		recipient = x;
	}

	public String getRecp() {
		return recipient;
	}
}

class KadRaya extends Card {
	public KadRaya(String r) {
	super(r);
	}

	public void greeting() {
	System.out.println("Dear " + getRecp() + ", \n");
	System.out.println("Selamat Hari Raya !\n");
	}
}

class Birthday extends Card {
	int age;

	public Birthday (String r, int years) {
	super(r);
	age = years;
	}

	public void greeting() {
	System.out.println("Dear " + getRecp() + ",\n");
	System.out.println("Happy "+age+"th Birthday!\n");
	}
}

class Wedding extends Card {
	public Wedding(String r) {
	super(r);
	}

	public void greeting() {
	System.out.println("Dear " + getRecp() + ", \n");
	System.out.println("Selamat Pengantin Baru !\n");
	}
}

public class CardTester {
	public static void main (String[] args) {
		Card [] a = new Card[3];
		a[0] = new KadRaya("Ahmad");
		a[1] = new Birthday("Ali", 21);
		a[2] = new Wedding("Abu");

		for(Card b : a)
			b.greeting();

		System.out.println("\n----- Normal for loop -----\n");

		for(int i = 0; i < 3; i++)
			a[i].greeting();
	}
}