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
}

public class EmployeeTest {
	public static void main(String args[]) {
		Employee emp1 = new Employee("Dr. Nor Sabrina", 47899, "Accounting", "Vice President");
		Employee emp2 = new Employee("En Ahmad", 39119, "IT\t", "Programmer");
		Employee emp3 = new Employee("Prof M Izzudin", 66666, "Consultation", "Manager");
		Employee emp4 = new Employee("Dr N Izzati", 34521, "Electronic", "CEO");
		Employee emp5 = new Employee("Dr A Rahman", 12321, "PR\t", "Manager");

		ArrayList<Employee> obj = new ArrayList<Employee>();
		obj.add(emp1);
		obj.add(emp2);
		obj.add(emp3);
		obj.add(emp4);
		obj.add(emp5);

		System.out.println("-- Display Object --");
		for(int i = 0; i < obj.size(); i++)
			System.out.println(obj.get(i).getName() + "\t" + obj.get(i).getIdNumber()
			+ "\t" + obj.get(i).getDepartment() + "\t" + obj.get(i).getPosition());

		System.out.println("\n------Using '.contain()' for emp1 -------");
		if(obj.contains(emp1))
			System.out.println("FOUND!");
		else
			System.out.println("NOT FOUND!");

		System.out.println("\n------Using '.isEmpty()' -------");

		if(obj.isEmpty())
			System.out.println("\nArrayList Employee is empty!");
		else
			System.out.println("\nArrayList Employee is not empty!");

		System.out.println("\n--- using '.remove()' to remove emp1 (Dr. Nor Sabrina) ---");
		obj.remove(0);
		for(int i = 0; i < obj.size(); i++)
			System.out.println(obj.get(i).getName() + "\t" + obj.get(i).getIdNumber()
			+ "\t" + obj.get(i).getDepartment() + "\t" + obj.get(i).getPosition());

		Employee emp6 = new Employee("Fakhrulradhi", 12345, "FC\t", "Student");
		obj.set(3, emp6);
		System.out.println("\n--- Replace emp5(Dr A Rahman) with new emp6 by using set() ---");
		for(int i = 0; i < obj.size(); i++)
			System.out.println(obj.get(i).getName() + "\t" + obj.get(i).getIdNumber()
			+ "\t" + obj.get(i).getDepartment() + "\t" + obj.get(i).getPosition());

		System.out.println("\n-------\nSize of ArrayList -> " + obj.size());

		System.out.println("\n--- Modify display only for name and position ---");
		for(int i = 0; i < obj.size(); i++)
			System.out.println(obj.get(i).getName() + "\t" + obj.get(i).getPosition());

		System.out.println("");
	}
}