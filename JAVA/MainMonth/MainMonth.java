import java.util.Scanner;

enum MonthName {
	JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUN(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);

	private int monthnum;

	private MonthName(int monthnum) {
		this.monthnum = monthnum;
	}

	public void setMonthnum(int y) {
		monthnum = y;
	}

	public int getMonthnum() {
		return monthnum;
	}
}


class Month {
	private MonthName obj;

	public Month() {
		obj = Enum.valueOf(MonthName.class, "JANUARY");
		obj.setMonthnum(1);
	}

	public Month(String x, int y) {
		obj = Enum.valueOf(MonthName.class, x);
		obj.setMonthnum(y);
	}

	public void setMonthNumber(int y) {
		if(y >= 1 && 12 <= y)
			obj.setMonthnum(y);
		else
			obj.setMonthnum(1);
	}

	public int getMonthNumber() {
		return obj.getMonthnum();
	}

	public MonthName getMonthName() {
		return obj;
	}

	public Boolean equals(Month a) {
		if(this.getMonthNumber() == a.getMonthNumber())
			return true;
		return false;
	}

	public Boolean greaterThan(Month a) {
		if(this.getMonthNumber() <= a.getMonthNumber())
			return true;
		return false;
	}

	public Boolean lessThan(Month a) {
		if(this.getMonthNumber() >= a.getMonthNumber())
			return true;
		return false;
	}
}

public class MainMonth {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		Month a = new Month();
		Month b = new Month("MARCH", 3);

		System.out.println("Month a: " + a.getMonthName() + " | " + a.getMonthNumber());
		System.out.println("Month b: " + b.getMonthName() + " | " + b.getMonthNumber());

		System.out.println("\na equal to b? : " + a.equals(b));
		System.out.println("a greater than b? : " + a.lessThan(b));
		System.out.println("a less than b? : " + a.greaterThan(b));

		System.out.print("\n");

		System.gc();
	}
}