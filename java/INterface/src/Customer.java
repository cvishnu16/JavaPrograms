import javax.swing.JOptionPane;
public class Customer extends Card {
	
	public static void main(String args[])
	{
	String a=JOptionPane.showInputDialog("enter your card no");
		 int num=Integer.parseInt(a);
		Card card=new Card();
		card.check(num);
		
	}

	
}
