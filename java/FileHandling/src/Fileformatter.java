import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class Fileformatter {
private Formatter f;
private Scanner s;
public void openFile()
{
/*try
{
	f=new Formatter("vishnu.txt");
	System.out.print("File created");
	}
catch(Exception e)
{
	System.out.println("File Not created");
}
*/
	
	try {
		s=new Scanner(new File("vishnu.txt"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("ERROR");
	}
	

}

public void readFile()
{
	

	System.out.print("THis is readFle");
while(s.hasNext())
{
	String a=s.next();
	String b=s.next();
	String c=s.next();
	
	System.out.printf("%s %s %s ",a,b,c);
	}


}

public void writeFile(String a,String b,String c)
{f.format("%s %s %s", a,b,c);
	}

public void closeFile()
{f.close();
System.out.println("CLOSED");
}
}
