import javax.swing.JOptionPane;
public class LoopSum {
	public static void main(String args[]){
		int cnt=0;
		int num;
		int sum=0;
		int ans=1;
		double avg;
		String ask1,ask2; //ask1 for number input, ask2 for continue input
		
		do {
			
		ask1=JOptionPane.showInputDialog("Enter your number :");

		num=Integer.parseInt(ask1);

		sum = sum + num;

		System.out.println("The total is : "+sum);

		ask2=JOptionPane.showInputDialog("Do you want to continue?(Enter 1 if YES)");

		ans=Integer.parseInt(ask2);	
		
		cnt++;			
	
		}while(ans==1);

		avg=sum/cnt;
		System.out.println("The average is : "+avg);

	}
}

	