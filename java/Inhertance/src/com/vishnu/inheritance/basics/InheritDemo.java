package com.vishnu.inheritance.basics;
//import  com.vishnu.inheritance.basics.Mycar;
public class InheritDemo {
	
	//static int a=1;
public static void main(String args[])
{Mycar my=new Mycar();	

my.gear(3);//Basics.func();
System.out.print("moving at speed "+my.b);
//System.out.print("moving at speed "+Basics.func());
}

public static void func()
{
System.out.print("this is sttat");	
}
}
