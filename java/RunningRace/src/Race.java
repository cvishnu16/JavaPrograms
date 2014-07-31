
public class Race {
	
	public static void main(String args[])
	{
		part run=new part();
		ThreadGroup group=new ThreadGroup("gr");
		Thread ram = new Thread(group,run, "RAM");
		Thread laxman = new Thread(group,run, "LAXMAN");
		ram.start();
		laxman.start();
		int a=group.activeCount();
		if(a==0)
		{
			System.out.println("GAME OVER");
		}
	}
	

}
