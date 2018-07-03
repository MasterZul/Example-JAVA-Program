import java.util.*;

class MyException extends Exception {
	private int x;
	private String mesg;

	public MyException(int i) {
		x = i;
		mesg = new String("\nError, age less that 16, which is " + x);
	}

	public String getMessage() {
		return mesg;
	}
}

public class Ex3 {
	public static void main(String[] a) {
		Scanner cin = new Scanner(System.in);

		final int YEAR = 2009;
		final int LIMIT = 16;
		int drive;

		try {
			System.out.print("Current Year: 2009\nEnter Year of Birth: ");
			int birth = cin.nextInt();

			int age = YEAR - birth;

			if(age < 16)
				throw new MyException(age);
			else {
				drive = age - LIMIT;

				if (drive < 4)
					System.out.println("\nYou will be charged RM1000 per year!");
				else
					System.out.println("\nYou will be charged only RM600 per year!");
			}
		}

		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}