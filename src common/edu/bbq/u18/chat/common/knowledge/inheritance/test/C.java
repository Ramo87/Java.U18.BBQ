package edu.bbq.u18.chat.common.knowledge.inheritance.test;

import edu.bbq.u18.chat.common.helpers.ConsolePrint;


/* java.lang.Object 
 * edu.bbq.u18.chat.common.knowledge.inheritance.test.A
 * edu.bbq.u18.chat.common.knowledge.inheritance.test.B
 * edu.bbq.u18.chat.common.knowledge.inheritance.test.C
 */
public class C extends B
{

//	public C() 
//	{
//		// TODO Auto-generated constructor stub
//		ConsolePrint.showln("Konstruktor C.C()");
//		System.out.println((this instanceof Object));
//		System.out.println((this instanceof A));
//		System.out.println((this instanceof B));
//	}
	public C(String param1) 
	{
		super(param1);
		// TODO Auto-generated constructor stub
		ConsolePrint.showln("Konstruktor C.C(String param1)");
		System.out.println((this instanceof Object));
		System.out.println((this instanceof A));
		System.out.println((this instanceof B));
	}

}
