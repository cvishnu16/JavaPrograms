import javax.swing.JOptionPane;
public class option {
public static void main(String args[])
{String s;int j;
	
	do
	{
		s=JOptionPane.showInputDialog("enter");
		if(s.equals("bach"))
		{j=1;
		break ;}
		else 
			j=0;
		
			
	}while(j==0);



}
}
