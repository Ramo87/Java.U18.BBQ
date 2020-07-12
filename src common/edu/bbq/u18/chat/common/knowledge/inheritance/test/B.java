package edu.bbq.u18.chat.common.knowledge.inheritance.test;

import edu.bbq.u18.chat.common.helpers.ConsolePrint;

/* java.lang.Object 
 * edu.bbq.u18.chat.common.knowledge.inheritance.test.A
 * edu.bbq.u18.chat.common.knowledge.inheritance.test.B
 */ 
public class B extends A
{

//	public B() 
//	{
//		// TODO Auto-generated constructor stub
//		ConsolePrint.showln("Konstruktor B.B()");
//		System.out.println((this instanceof Object));
//
//	}
	public B(String param1) 
	{
		super(param1);
		// TODO Auto-generated constructor stub
		ConsolePrint.showln("Konstruktor B.B(String param1)");
		System.out.println((this instanceof Object));
		System.out.println((this instanceof A));

	}

}
