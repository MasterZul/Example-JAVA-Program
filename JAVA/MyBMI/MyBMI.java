import java.util.Scanner;

class BMI {
	private char gen;
	private double height, weight, bmi;
	private String name;

	Scanner cin = new Scanner(System.in);

	public void setName() {
		System.out.print("Name-> ");
		name = cin.nextLine();
	}

	public void setHeight() {
		System.out.print("Height (Inches)-> ");
		height = cin.nextDouble();
	}

	public void setWeight() {
		System.out.print("Weight (Pounds)-> ");
		weight = cin.nextDouble();
	}

	public void calcBmi() {
		double square = height * height;
		double div = weight/square;
		bmi = div*703;
	}

	public void getFeet() {
		int feet, inches;

		feet = (int)height/12;
		inches = (int)height-(feet*12);

		System.out.println("Your height is " + feet + " ft " + inches + " inches");
	}

	public void setGender() {
		System.out.print("Gender (M/F)-> ");
		gen = cin.next().trim().charAt(0);
	}

	public void getBmi() {
		calcBmi();
		System.out.printf("Your BMI is %.2f", bmi);
		System.out.print("\n");

		if(gen == 'M') {
			if(bmi < 20.7)
				System.out.println("You are underweight!");
			else if(bmi < 26.4)
				System.out.println("You have an ideal weight!");
			else if(bmi < 27.8)
				System.out.println("You are marginally overweight!");
			else if(bmi < 31.1)
				System.out.println("You are overweight!");
			else if(bmi < 45.4)
				System.out.println("You are obese!");
			else
				System.out.println("You are extreamly obese");

			return;
		}

		if(gen == 'F') {
			if(bmi < 19.1)
				System.out.println("You are underweight!");
			else if(bmi < 25.8)
				System.out.println("You have an ideal weight!");
			else if(bmi < 27.3)
				System.out.println("You are marginally overweight!");
			else if(bmi < 32.2)
				System.out.println("You are overweight!");
			else if(bmi < 44.8)
				System.out.println("You are obese!");
			else
				System.out.println("You are extreamly obese");

			return;
		}

	}

	public void print() {
		System.out.println("\nHello " + name);
		getFeet();
		System.out.println("Your weight is " + (int)weight + "lb");
		getBmi();
	}

}

public class MyBMI {
	public static void main (String[] args) {
		BMI man = new BMI();
		man.setName();
		man.setHeight();
		man.setWeight();
		man.setGender();

		man.print();
	}
}