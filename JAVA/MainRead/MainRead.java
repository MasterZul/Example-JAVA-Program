
abstract class ReadingItem {
	private String title;
	private double price;

	public ReadingItem() {
		title = "";
		price = 0.0;
	}

	public ReadingItem(double x, String y) {
		title = y;
		price = x;
	}

	public String getName() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	abstract public double calculatePrice();
	abstract public void displayInfo();
}

class Customer {
	private String customerName;
	private double totalPay;
	private ReadingItem item;

	public Customer(String x) {
		customerName = x;
	}

	public void buy(ReadingItem x) {
		item = x;
		totalPay = x.calculatePrice();
	}

	public double getTotalPay() {
		return totalPay;
	}

	public String toString() {
		String a = "Customer Name: " + customerName;
		String x = String.format("%.2f", totalPay);
		String b = "\nTotal Pay: RM " + x;
		String c = "\nReading Item Bought: \"" + item.getName() + "\"";
		item.displayInfo();

		return a+b+c+"\n\n";
	}
}

interface GST_Chargeable {
	double RATE = 0.06;

	public double getGSTCharges();
}

class Encyclopedia extends ReadingItem implements GST_Chargeable {
	private int year;

	public Encyclopedia() {
		year = 0;
	}

	public Encyclopedia(String x, double y, int z) {
		super(y, x);
		year = z;
	}

	public double calculatePrice() {
		return getPrice() + getGSTCharges();
	}

	public void displayInfo() {
		System.out.println("--------------------");
		System.out.println("Book Name: \"" + getName() + "\"");
		System.out.println("Year: " + year);
		System.out.printf("GST Charges: RM%.2f \n", getGSTCharges());
		System.out.printf("Book Original Price: RM%.2f \n", getPrice());
		System.out.printf("Price Need to Pay: RM%.2f \n", calculatePrice());
		System.out.println("--------------------");
	}

	public double getGSTCharges() {
		double gst = getPrice() * RATE;
		return gst;
	}
}

class Magazine extends ReadingItem implements GST_Chargeable {
	private int monthIssue;
	private int year;

	public Magazine() {
		monthIssue = 0;
		year = 0;
	}

	public Magazine(int w, int x, double y, String z) {
		super(y, z);
		monthIssue = w;
		year = x;
	}

	public double calculatePrice() {
		return getPrice() + getGSTCharges();
	}

	public void displayInfo() {
		System.out.println("--------------------");
		System.out.println("Book Name: \"" + getName() + "\"");
		System.out.println("Month Issue: " + monthIssue);
		System.out.println("Year: " + year);
		System.out.printf("GST Charges: RM%.2f \n", getGSTCharges());
		System.out.printf("Book Original Price: RM%.2f \n", getPrice());
		System.out.printf("Price Need to Pay: RM%.2f \n", calculatePrice());
		System.out.println("--------------------");
	}

	public double getGSTCharges() {
		double gst = getPrice() * RATE;
		return gst;
	}
}

class Book extends ReadingItem {
	private String author;
	private int year;

	public Book() {
		author = "";
		year = 0;
	}

	public Book(String x, double y, String z, int a) {
		super(y, x);
		author = z;
		year = a;
	}

	public double calculatePrice() {
		return getPrice();
	}

	public void displayInfo() {
		System.out.println("--------------------");
		System.out.println("Book Name: \"" + getName() + "\"");
		System.out.println("Book Author: " + author);
		System.out.printf("Book Original Price: RM%.2f \n", getPrice());
		System.out.printf("Price Need to Pay: RM%.2f \n", calculatePrice());
		System.out.println("--------------------");
	}
}

public class MainRead {
	public static void main (String [] args) {
		ReadingItem [] read = new ReadingItem[3];
		read[0] = new Encyclopedia("Animal Kingdom", 34.50, 2012);
		read[1] = new Magazine(5, 2009, 7.35, "PC World");
		read[2] = new Book("You and Me", 20.13, "Radhi Sha'ri", 2016);

		Customer [] cust = new Customer[3];
		cust[0] = new Customer("Radhi");
		cust[1] = new Customer("Syafig");
		cust[2] = new Customer("Fazrin");

		int i = 0;
		for(Customer p : cust) {
			p.buy(read[i]);
			System.out.println("Customer [ " + (i+1) + " ]");
			System.out.println(p.toString());
			i++;
		}
	}
}

