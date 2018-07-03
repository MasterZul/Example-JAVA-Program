class MyException extends Exception {
	private int value;
	private String message;

	public MyException(int i) {
		value = i;
		message = new String("MyException occurs at value: " + value);
	}

	public String getMessage() {
		return message;
	}
}

public class Propagate {
	public void method1(int i) {
		try {
			method2(i);
		}

		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}

	public void method2(int i) throws MyException {
		if(i == 1)
			throw new MyException(i);
		else {
			method3(i);
		}
	}

	public void method3(int i) throws MyException {
		if(i == 0)
			throw new MyException(i);
		else
			System.out.println("i = " + i);
		}

	public static void main(String[] args) {
		Propagate p = new Propagate();
		for (int i = 0; i < 3; i++)
			p.method1(i);
	}
}
