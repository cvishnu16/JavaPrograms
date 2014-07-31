import java.util.*;
import java.io.*;
import java.lang.*;
public class Scanda {
	
	private Scanner s;
	public void OpenFile()
	{
		try {
			s=new Scanner(new File("vishnu.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR");
		}
	}
	 public void read()
	 {
		 while (s.hasNext())
		 {
			 String a=s.next();
			 String b=s.next();
			 String c=s.next();
			 System.out.printf("%s %s %s",a,b,c);
		 }
	 }
public void close()
{s.close();
	}
}
