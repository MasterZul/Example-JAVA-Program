import javax.swing.JOptionPane;
import java.util.Scanner;


public class Tuition{
   public static void main (String args[]){
	
		Scanner input = new Scanner(System.in);
        	String s1;
            	String hour;
             	double h = 0.0;
             	double income;
       		
     
        for(int i = 0; i < 5; i++){

             
             
             s1 = JOptionPane.showInputDialog ( "Please insert teacher's name" );
             //n1 = input.nextString();

             hour = JOptionPane.showInputDialog ( "Please insert hours of worked" );
             h = Double.parseDouble(hour);
             

             income = h * 30;
           
		
	 	System.out.println(i + 1);
		System.out.println(s1);
 		System.out.println(h);
		System.out.println(income);
                System.out.println("\n"); 
          }
           

          System.exit(0);
     }
}

        