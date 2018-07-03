package bentuk;
public class SegiTigaTepat
{
	private int tapak;
	private int tinggi;

	public SegiTigaTepat(int tpk, int tgi)
	{
		tapak=tpk;
		tinggi=tgi;
	}

	public void paparMaklumat()
	{
		System.out.println("Bentuk: Segi Tiga Tepat");
		System.out.println("Tapak: "+tapak);
		System.out.println("Tinggi: "+tinggi);
	}

	public int luas()
	{
		return tapak*tinggi/2;
	}
}


