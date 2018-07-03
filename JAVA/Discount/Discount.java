import java.util.Scanner;

public class Discount {
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		int n = 0;
		System.out.println("Please enter number of item");
                n = input.nextInt();

	if ( n >= 10 && n <= 49 ) {
		System.out.println("10% Discount");
             }
 	else if ( n >= 50 && n <= 99 ) {
		System.out.println("20% Discount");
	     }	
	else if ( n >= 100 && n <= 149 ) {
		System.out.println("30% Discount");
	     }	
	else if ( n >= 150) {
		System.out.println("40% Discount");
	     }
	else {
		System.out.println("Invalid");
	     }

     }
}	