package abstractClasses.knowledge.inheritance.abstractClasses;

/**
 * Created by Loky on 13/07/2020.
 */
public abstract class TestAbstractClass1 {

    void printTAC2()
    {
        System.out.println( "new test().printTAC2()- TestAbstractenClasse2!");
    }

    static void printStatic() {
        System.out.println( "TestAbstractClass2.printStatic() - statischer Aufruf aus der Interface!" );

    }

    abstract void printAbstractTAC1();
}
