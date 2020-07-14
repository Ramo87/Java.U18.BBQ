package abstractClasses.knowledge.inheritance.test;

public class Test 
{

	public static void main(String[] args) 
	{
		C c = new C("x");

		c.defaultVisibleMethodFromClassA();
		c.defaultVisibleMethodFromClassB();
		c.defaultVisibleMethodFromClassC();

		c.protectedVisibleMethodFromClassA();
		c.protectedVisibleMethodFromClassB();
		c.protectedVisibleMethodFromClassC();

		c.protectedVisibleMethodFromClassA();
		c.protectedVisibleMethodFromClassB();
		c.protectedVisibleMethodFromClassC();

		/* type = new Instance */
		//C c2 = new A("A"); connot convert from A to C
		//C c2 = new B("B"); connot convert from B to C
		//C c2 = new Object(); connot convert from object to C

		C c2 = new C("cd");

		A a1= new C("A");

		a1.defaultVisibleMethodFromClassA();
		a1.protectedVisibleMethodFromClassA();
		a1.publicVisibleMethodFromClassA();

		B b1= new C("B");

		b1.defaultVisibleMethodFromClassA();
		b1.defaultVisibleMethodFromClassB();

		b1.protectedVisibleMethodFromClassA();
		b1.protectedVisibleMethodFromClassB();

		b1.publicVisibleMethodFromClassA();
		b1.publicVisibleMethodFromClassB();


		a1.defaultVisibleMethodFromClassA();
		a1.protectedVisibleMethodFromClassA();
		a1.publicVisibleMethodFromClassA();



		a1 = new B("B");
		System.out.println("\n1.1 Ist a1 eine Instance von B  " + (a1 instanceof B) + "Type :" + a1.getClass().getTypeName());
		System.out.println("\n1.2 Ist a1 eine Instance von C  " + (a1 instanceof C) + "Type :" + a1.getClass().getTypeName() + "\n");
		//a1=b1; // Implizitetypumwandelung - > boxingm unboxing, autoboxing;

		long x = 10;

		System.out.println("\nIst a1 eine Instance von B  " + (a1 instanceof B) + "Type :" + a1.getClass().getTypeName() + "\n");

		a1 = (A)b1; //Casting - Explizite Typumwandelung;

		System.out.println("\nIst a1 eine Instance von B  " + (a1 instanceof B) + "Type :" + a1.getClass().getTypeName() + "\n");

		Object o1 = new C("Object");
		if(a1 instanceof C)
		{
			C c3 = (C)o1;

		}
		System.out.println(("\nIst o1 eine Instance von B  " + (o1 instanceof B) + "Type :" + o1.getClass().getTypeName() + "\n"));

	}
}
