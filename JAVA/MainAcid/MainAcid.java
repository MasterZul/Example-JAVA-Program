import java.util.Scanner;

enum Acid {
	RED("Acidic Substance"), BLUE("Basic Material"), PURPLE("Neutral");

	private String exp;

	private Acid(String exp) {
		this.exp = exp;
	}

	public String getExp() {
		return exp;
	}
}

public class MainAcid {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.print("Enter colour -> ");
		String x = cin.next().toUpperCase();

//		if(x != "RED" || x != "BLUE" || x != "PURPLE")
//			{System.out.println("**Error!"); System.exit(0);}

		Acid acid = Enum.valueOf(Acid.class, x);

		System.out.println("Colour: " + acid);
		System.out.println("Acidity: " + acid.getExp());

		cin = null;
		x = null;
		acid = null;
		System.gc();
	}
}