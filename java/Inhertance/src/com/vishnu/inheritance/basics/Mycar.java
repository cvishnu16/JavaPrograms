package com.vishnu.inheritance.basics;
public class Mycar extends Car 
{
	/*public Mycar(int x) 
	{
		
		// TODO Auto-generated constructor stub
	}*/
	int g=0;
	public int sp;
	public void gear(int g)
	{move();
		this.g=g;
		sp=super.sp *=(g+1);
		System.out.print(" at speed "+sp);
		
	}

}
