
public class Ex2 {
	public static void main (String[] args) {
		int [] x = {1, 2, 3, 4, 5};

		try {
			for(int i = 0; i <= 6; i++)
				System.out.println(x[i]);
		}

		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("*Error! Program trying to display 6th value...");
		}
	}
}