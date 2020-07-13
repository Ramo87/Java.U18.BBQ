package edu.bbq.u18.chat.common.knowledge.inheritance.test;

import edu.bbq.u18.chat.common.helpers.ConsolePrint;

public class A
{
	int defaultVisibleInstanceField             = 1;
	protected int protectedVisibleInstanceField = 2;
	public int publicVisibleInstanceField       = 3;
	private int privateVisibleInstanceField     = 4;

public A(){}
//	{
//		ConsolePrint.showln("Konstruktor A.A()");
//		
//		System.out.println((this instanceof Object));
//	}

	public A(String param1)
	{


		
		System.out.println((this instanceof Object));
	}
	public void publicVisibleMethodFromClassA(){
		System.out.println("public visible Method from class A");
	}

	void defaultVisibleMethodFromClassA(){
		System.out.println("default visible Method from class A");
	}

	protected void protectedVisibleMethodFromClassA(){
		System.out.println("protected visible Method from class A");
	}

	private void privateVisibleMethodFromClassA(){
		System.out.println("private visible Method from class A");
	}
}
