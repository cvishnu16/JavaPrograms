
public class part implements Runnable {
	public static String winner;
	boolean stat;
	
	
	
	
	
	
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.race();
	}
     private void race() 
     {
		// TODO Auto-generated method stub
	for(int i=0;i<10;i++)
	{check(i);
		if(!stat)
		System.out.println("Distance by "+Thread.currentThread().getName()+" = "+i);
		else {
			break;
		}
	}
	}
	private void check(int i) {
		// TODO Auto-generated method stub
		//System.out.println("this is check -"+i);
		if((i==9)&&(winner==null))
			{winner=Thread.currentThread().getName();stat=true;System.out.println("Winner "+winner);}
	
		if((i==4)&&(Thread.currentThread().getName().equals("Laxman")))
		{try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}
		
	}

}
