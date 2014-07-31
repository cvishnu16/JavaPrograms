import java.io.File;


public class MyClass {

public static void main(String args[])
{
	File f=new File("vishnu.txt");
	if(f.exists())
	{
/*Fileformatter obj =new Fileformatter();
obj.openFile();
obj.writeFile("I am","a big", " Loser");
obj.readFile();
obj.closeFile();
*/
		
		Scanda obj =new Scanda();
		obj.OpenFile();
		
		obj.read();
		obj.close();
	
	}else
{
	System.out.println("TH");
	}
}
}
