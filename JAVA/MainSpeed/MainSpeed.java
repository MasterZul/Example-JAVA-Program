import java.util.Scanner;

class Speed {
	private int hour;
	private double km;

	Scanner cin = new Scanner(System.in);

	public Speed() {
		hour = 0;
		km = 0;
	}

	public Speed(int x, double y) {
		hour = x;
		km = y;
	}

	public void setHour() {
		System.out.print("Hour-> ");
		hour = cin.nextInt();
	}

	public void setKm() {
		System.out.print("Distance (KM)-> ");
		km = cin.nextDouble();
	}

	public int getHour() {
		return hour;
	}

	public double getKm() {
		return km;
	}

	public double calcSpeed() {
		return km*hour;
	}

	public String toString() {
		return "Distance " + km + " km and time " + hour + " hour will produce speed of " + calcSpeed();
	}
}

public class MainSpeed {
	public static void main(String[] args) {
		Speed a = new Speed();
		a.setHour();
		a.setKm();

		Speed b = new Speed(15, 400);

		System.out.println(a.toString());
		System.out.println(b.toString());
	}
}