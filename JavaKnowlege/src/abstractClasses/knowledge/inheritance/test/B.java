package abstractClasses.knowledge.inheritance.test;

import edu.bbq.u18.chat.common.helpers.ConsolePrint;

/* java.lang.Object 
 * A
 * B
 */ 
public class B extends A
{

public B() {}
//	{
//
//		ConsolePrint.showln("Konstruktor B.B()");
//		System.out.println((this instanceof Object));
//
//	}
	public B(String param1) 
	{
		super(param1);

		ConsolePrint.showln("Konstruktor B.B(String param1)");
		System.out.println((this instanceof Object));
		System.out.println((this instanceof A));

	}
	public void publicVisibleMethodFromClassB(){
		System.out.println("public visible Method from class B");
	}

	void defaultVisibleMethodFromClassB(){
		System.out.println("default visible Method from class B");
	}

	protected void protectedVisibleMethodFromClassB(){
		System.out.println("protected visible Method from class B");
	}

	private void privateVisibleMethodFromClassB(){
		System.out.println("private visible Method from class B");
	}


}
