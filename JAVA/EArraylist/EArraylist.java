import java.util.*;

class EArraylist {
	public static void main(String args[]) {

		ArrayList<String> student = new ArrayList<String>();

		student.add("Siti Rahimah");
		student.add("Robert Lau");

		for(int i=0; i < student.size(); i++)
			System.out.print(student.get(i) + " ");
		System.out.println();

		student.set(0, "Muhammad");

		for(int i=0; i < student.size(); i++)
			System.out.print(student.get(i) + " ");
		System.out.println();
	}
}