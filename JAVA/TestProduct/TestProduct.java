interface Taxable {
	double GASTAXRATE = 0.75;
	double MOTORVEHICLTAXRATE = 0.50;

	double calcTax();
}

abstract class Product {
	private String description;
	private double price;

	public Product(String x, double y) {
		description = x;
		price = y;
	}

	abstract public String display();

	public double getPrice() {
		return price;
	}

	public String getDesc() {
		return description;
	}

	public double price() {
		return price;
	}
}

class Gasoline extends Product implements Taxable {
	private String type;

	public Gasoline(String p, String x, double q) {
		super(p, q);
		type = x;
	}

	public String getType() {
		return type;
	}

	public String display() {
		return ("\n" + getDesc() + " | RM" + getPrice() + " | " +  type + " | Tax: " + calcTax());
	}

	public double calcTax() {
		return (getPrice() * GASTAXRATE);
	}
}

class MotorVehicle extends Product implements Taxable{
	private String motorType;

	public MotorVehicle(String p, String x, double q) {
		super(p, q);
		motorType = x;
	}

	public String getMotorType() {
		return motorType;
	}

	public String display() {
		return ("\n" + getDesc() + " | RM" + getPrice() + " | " +  motorType + " | Tax: " + calcTax());
	}

	public double calcTax() {
		return (getPrice() * MOTORVEHICLTAXRATE);
	}
}

class Food extends Product {
	private int calories;

	public Food(String p, double q, int a) {
		super(p, q);
		calories = a;
	}

	public int getCalory() {
		return calories;
	}

	public String display() {
		return ("\n" + getDesc() + " | RM" + getPrice() + " | " +  calories);
	}
}

public class TestProduct {
	public static void main (String[] args) {
		Product [] inv = new Product[4];
		inv[0] = new Food("Meat", 14.40, 2000);
		inv[1] = new Food("Banana", 1.50, 500);
		inv[2] = new MotorVehicle("Proton", "Car", 56000);
		inv[3] = new Gasoline("Unleaded", "Diesel", 2.50);

	for(Product a : inv)
		System.out.println(a.display());

	System.out.println();
	}
}
