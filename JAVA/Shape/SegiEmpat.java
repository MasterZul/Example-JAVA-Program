package bentuk;
public class SegiEmpat	{
	private int panjang;
	private int lebar;

	public SegiEmpat(int pjg, int lbr)	{
		panjang = pjg;
		lebar = lbr;
	}

	public void paparMaklumat() {
		System.out.println("Bentuk: Segi Empat");
		System.out.println("Panjang: " + panjang);
		System.out.println("Lebar: " + lebar);

		if (panjang == lebar)
			System.out.println("Jenis: Segi empat sama");
		else
			System.out.println("Jenis: Segi empat tepat");
	}

	public int luas() {
		return panjang * lebar;
	}
}
