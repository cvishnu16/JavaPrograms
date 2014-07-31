
public class Card implements Master,Visa{
public void check(int a)
{   
	switch(a)
	{
	case Visa.VPass:checkVisa();
		break;
	case Master.MPass:checkMaster();
		break;
	default :System.out.print("NOt valid");
	
	}
		
	}

	

	@Override
	public void checkMaster() {
		// TODO Auto-generated method stub
		
			System.out.print("Master It IS");
	}
	@Override
	public void checkVisa() {
		// TODO Auto-generated method stub
		System.out.print("VISA It IS");
	}

}
