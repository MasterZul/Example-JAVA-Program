class Employee {
	private String name, hire;
	private int num;

	public Employee () {
		name = null;
		num = 0;
		hire = null;
	}

	public Employee (String x, int y, String z) {
		name = x;
		num = y;
		hire = z;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Employee Number: " + num);
		System.out.println("Hire Date: " + hire);
	}
}

class Prod_Worker extends Employee {
	private int shift;
	private double hourpay;

	public Prod_Worker (int x, double y) {
		shift = x;
		hourpay = y;
	}

	public void display() {
		if(shift == 1)
			System.out.println("Shift: Day");
		else
			System.out.println("Shift: Night");
		System.out.println("Hourly Pay Rate: RM " + hourpay);
	}

}

class ShiftSv extends Employee {
	private double annSal, annBon;

	public ShiftSv (String a, int b, String c, double x, double y) {
		super(a, b, c);								// Have super function
		annSal = x;
		annBon = y;
	}

	public void display() {
		super.display();							// Have super function
		System.out.println("Annual Salary: RM "  + annSal);
		System.out.println("Annual Bonus: RM " + annBon);
	}

}

class TeamLead extends Employee {
	private double monBonus;
	private int trainHours, doneHours;

	public TeamLead (double x, int y, int z) {
		monBonus = x;
		trainHours = y;
		doneHours = z;
	}

	public void display() {
		System.out.println("Monthly Bonus: RM " + monBonus);
		System.out.println("Required Training Hours: " + trainHours);
		System.out.println("Done Training Hours: " + doneHours);
	}

}

public class TestEmployee {
	public static void main(String[] args) {

		Employee[] emp = new Employee[4];
		emp[0] = new Employee("Ali", 12345, "27/4/2016");
		emp[1] = new Prod_Worker(1, 30.00);
		emp[2] = new ShiftSv("Ahmad", 22222, "10/4/2016", 1200.00, 50.00);
		emp[3] = new TeamLead(30.00, 12, 9);

		for(Employee em : emp) {
			em.display();
			System.out.println();
		}
	}
}