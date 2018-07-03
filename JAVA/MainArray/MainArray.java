import java.util.Scanner;

class TryArray {
	public static float avg(int[] arr){
		int total = 0;
		float x;

		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}

		x = (float)total/arr.length;
		return x;
	}

	public static int big(int[] arr) {
		int big = 0;

		for(int val : arr) {
			if(big < val)
				big = val;
		}
		return big;
	}
}

public class MainArray {
	public static void main(String[] args) {
		int[] numArray = {4, 5, 2, 8, 9, 10};

		System.out.println("Original Value: ");
		for(int val : numArray)
			System.out.print(val + " ");

		for(int i = 0; i < numArray.length; i++) {
			numArray[i] += 5;
		}

		System.out.println("\n\nAfter add 5: ");
		for(int val : numArray)
			System.out.print(val + " ");

		System.out.println("\n\nIn Backward: ");
		for(int i = numArray.length - 1; i >= 0; i--) {
			System.out.print(numArray[i] + " ");
		}

		System.out.println("\n----------\n");
		Scanner cin = new Scanner(System.in);
		System.out.print("How much to enter? -> ");
		int count = cin.nextInt();
		int[] numArray2 = new int[count];

		System.out.println("Enter list of " + numArray2.length + " number -> ");
		for(int i = 0; i < numArray2.length; i++)
			numArray2[i] = cin.nextInt();

		System.out.println("\nnumArray2 Value: ");
		for(int val : numArray2)
			System.out.print(val + " ");

		System.out.println("\n\nAverage: " + TryArray.avg(numArray2));
		System.out.println("Biggest: " + TryArray.big(numArray2) + "\n");
	}
}
