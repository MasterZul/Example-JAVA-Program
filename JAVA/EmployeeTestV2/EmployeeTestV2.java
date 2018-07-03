import java.util.*;

class Employee {
	private String name;
	private int idNumber;
	private String department;
	private String position;

	public Employee() {
		name = null;
		idNumber = 0;
		department = null;
		position = null;
	}

	public Employee(String w, int x, String y, String z) {
		name = w;
		idNumber = x;
		department = y;
		position = z;
	}

	public void setName(String a) {
		name = a;
	}

	public void setIdNumber(int a) {
			idNumber = a;
		}

	public void setDepartment(String a) {
		department = a;
	}

	public void setPosition(String a) {
		position = a;
	}

	public String getName() {
		return name;
	}

	public int getIdNumber() {
			return idNumber;
		}

	public String getDepartment() {
		return department;
	}

	public String getPosition() {
		return position;
	}

	public static void display(Employee obj[]) {
		for(int i = 0; i < obj.length; i++)
			System.out.println(obj[i].getName() + "\t" + obj[i].getIdNumber()
			+ "\t" + obj[i].getDepartment() + "\t" + obj[i].getPosition());
	}
}

public class EmployeeTestV2 {
	public static void main(String args[]) {
		Employee emp1 = new Employee("Dr. Nor Sabrina", 47899, "Accounting", "Vice President");
		Employee emp2 = new Employee("En Ahmad", 39119, "IT\t", "Programmer");
		Employee emp3 = new Employee("Prof M Izzudin", 66666, "Consultation", "Manager");
		Employee emp4 = new Employee("Dr N Izzati", 34521, "Electronic", "CEO");
		Employee emp5 = new Employee("Dr A Rahman", 12321, "PR\t", "Manager");

		Employee obj[] = new Employee[5];
		obj[0] = emp1;
		obj[1] = emp2;
		obj[2] = emp3;
		obj[3] = emp4;
		obj[4] = emp5;

		Employee.display(obj);

	}
}