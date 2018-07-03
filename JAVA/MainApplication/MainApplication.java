class WeightConverter {
	private double gravity;

	public WeightConverter(double x) {
		gravity = x;
	}

	public double convert(double y) {
		return y * gravity;
	}
}

class VenusConverter {
	private double gravity;

	public VenusConverter(double x) {
		gravity = x;
	}

	public double convert(double y) {
		return y * gravity;
	}
}

class JupiterConverter {
	private double gravity;

	public JupiterConverter(double x) {
		gravity = x;
	}

	public double convert(double y) {
		return y * gravity;
	}
}

public class MainApplication
{
	public static void main(String[] args) {
		double yourMoonWeight;
		double yourVenusWeight;
		double yourJupiterWeight;
		WeightConverter moonWeight;
		VenusConverter venusWeight;
		JupiterConverter jupiterWeight;

		moonWeight = new WeightConverter(0.167);
		venusWeight = new VenusConverter(0.9);
		jupiterWeight = new JupiterConverter(2.5);

		yourMoonWeight = moonWeight.convert(65);
		yourVenusWeight = venusWeight.convert(65);
		yourJupiterWeight = jupiterWeight.convert(65);
		System.out.println("65 kg on the earth is equivalent to " + yourMoonWeight + " kg on the Moon");
		System.out.println("65 kg on the earth is equivalent to " + yourVenusWeight + " kg on the Venus");
		System.out.println("65 kg on the earth is equivalent to " + yourJupiterWeight + " kg on the Jupiter");
	}
}