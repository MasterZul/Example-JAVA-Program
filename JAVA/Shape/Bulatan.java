package bentuk;

public class Bulatan
{
  private int titikTengahX, titikTengahY;
  private int jejari;

  public Bulatan(int x, int y, int j)
  {
    titikTengahX = x;
    titikTengahY = y;
    jejari = j;
  }

  public void paparMaklumat()
  {
    System.out.println("Bentuk : Bulatan");
    System.out.println("Titik tengah: " + titikTengahX + " , " + titikTengahY);
    System.out.println("Jejari : " + jejari);
  }

  public int luas()
  {
    return(int) (Math.PI * Math.pow(jejari,2));
  }
}