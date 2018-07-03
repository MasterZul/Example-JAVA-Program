import java.util.Scanner;

enum MonthName {
	JANUARY(1), FEBRUARY(2), MARCH(3). APRIL(4), MAY(5), JUN(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);

	private int num;

	private MonthName(String num) {
		this.num = num;
	}

	public int getNum() {
		return exp;
	}
}


class Month {

}

public class MainMonth {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter colour -> ");
		String x = cin.next().toUpperCase();

		Acid acid = Enum.valueOf(Acid.class, x);

		System.out.println("Colour: " + acid);
		System.out.println("Acidity: " + acid.getExp());

		System.gc();
	}
}