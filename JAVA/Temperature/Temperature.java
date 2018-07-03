import javax.swing.JOptionPane;

public class Temperature{
   public static void main (String args[]){
        
        String question; 
        int q;
        int n1 = 0;
        int n2 = 0;
     

        question = JOptionPane.showInputDialog ( "Press 1 for Fahrenheit, 2 for Celcius" );

        q = Integer.parseInt(question);

        if (q == 1){
              int answer1; // nak cari celcius
              String s1;
              
              
              s1 = JOptionPane.showInputDialog ( "Please insert temperature" );
              n1 = Integer.parseInt(s1);

              answer1 = (5*(n1-32)/9);
           
              JOptionPane.showMessageDialog(null,answer1, "Result", JOptionPane.INFORMATION_MESSAGE);


             } 
             else if (q == 2){
              int answer2;  // nak cari fahrenheit
              String s2;
              
              
              s2 = JOptionPane.showInputDialog ( "Please insert temperature" );
              n2 = Integer.parseInt(s2);

              answer2 = (n2*(9/5)+32);
           
              JOptionPane.showMessageDialog(null,answer2, "Result", JOptionPane.INFORMATION_MESSAGE);


             } 
                else {
                 System.out.println("Error");
                  }

              System.exit(0);
       }
}

