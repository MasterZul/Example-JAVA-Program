import java.util.Scanner;

public class Tiga {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double elapsed, temp;

	System.out.print("Type the time elapsed : ");
	elapsed=input.nextDouble();

	temp= (4*elapsed*elapsed)/(elapsed+2)-20;
	System.out.println("The temperature is "+temp);
	}
}


