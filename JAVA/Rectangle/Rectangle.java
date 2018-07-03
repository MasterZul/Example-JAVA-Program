import java.util.Scanner;

public class Rectangle {
  private double width;
  private double length;

  public Rectangle () {}
  public Rectangle (double w, double l) {
    width = w;
    length = l;
  }

  public Rectangle(Rectangle object) {
    this.width  = object.width;
    this.length = object.length;
  }

  public void setWidth  (double w) {width  = w;}
  public void setLength (double l) {length = l;}

  public double getWidth  () {return width;}
  public double getLength () {return length;}

  public double calcArea () {return width*length;}

  public boolean equals(Rectangle r) {
       return (this.calcArea() == r.calcArea());
    }


  public String toString () {
    return String.format("A rectangle object of width " +width+ ", length " +length+ ", and area "+calcArea());
  }



  public Rectangle inputRectangle () {
    Scanner inp = new Scanner (System.in);
    System.out.print("Enter width: ");
    double w = inp.nextDouble();
	System.out.print("Enter length: ");
	double l = inp.nextDouble();

    return new Rectangle (w, l);
  }
}