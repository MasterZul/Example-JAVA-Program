class Bigger {
	public static void main(String[] args) {
	Better b;
	Better.Faster f3 = Better.Faster.Longer;
	b = f3;

	}
}

class Better {
	enum Faster {Higher, Longer};
}
