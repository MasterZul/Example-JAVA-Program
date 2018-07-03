import javax.swing.JOptionPane;

public class Shipping{
   public static void main (String args[]){
        
       double total = 0;
       // String question; 
        //int q;
     

        //question = JOptionPane.showInputDialog ( "Please enter number of boxes" );

       // q = Integer.parseInt(question);

        //while (q < 4){
     
        for(int i = 0; i < 3; i++){

             String s1;
             String s2;
             double n1 = 0.0;
             double n2 = 0.0;
             double charge;
             
             s1 = JOptionPane.showInputDialog ( "Please insert five digit code id" );
             n1 = Double.parseDouble(s1);

             s2 = JOptionPane.showInputDialog ( "Please insert weight of box in Kg and gram" );
             n2 = Double.parseDouble(s2);
             

             charge = n2 * 20.56;
             total = total + charge;
            
          }
           JOptionPane.showMessageDialog(null,total, "Result", JOptionPane.INFORMATION_MESSAGE);

          System.exit(0);
     }
}

        