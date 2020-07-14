package abstractClasses.knowledge.inheritance.test;

import edu.bbq.u18.chat.common.helpers.ConsolePrint;

public class C extends B {

	public C() {

	}

	public C(String c){
		super(c);
	}
//	{
//		// TODO Auto-generated constructor stub
//		ConsolePrint.showln("Konstruktor C.C()");
//		System.out.println((this instanceof Object));
//		System.out.println((this instanceof A));
//		System.out.println((this instanceof B));
//	}
	public C(String param1, String param2)
	{
		super(param1);
		// TODO Auto-generated constructor stub
		ConsolePrint.showln("Konstruktor C.C(String param1)");
		System.out.println((this instanceof Object));
		System.out.println((this instanceof A));
		System.out.println((this instanceof B));
		System.out.println((this instanceof C));

	}

	public void publicVisibleMethodFromClassC(){
		System.out.println("public visible Method from class C");
	}

	void defaultVisibleMethodFromClassC(){
		System.out.println("default visible Method from class C");
	}

	protected void protectedVisibleMethodFromClassC(){
		System.out.println("protected visible Method from class C");
	}

	private void privateVisibleMethodFromClassC(){
		System.out.println("private visible Method from class C");
	}

}
