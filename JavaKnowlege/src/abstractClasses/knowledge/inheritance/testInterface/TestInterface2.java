package abstractClasses.knowledge.inheritance.testInterface;

/**
 * Created by Loky on 13/07/2020.
 */
public interface TestInterface2 {
    default void printTi2() {
        System.out.println( "new test().printStatic()- TestInterface2");
    }

    static void printStaticTi2() {
        System.out.println( "TestInterface2.printStatic() - statischer Aufruf aus  dem Interface!" );

    }

    abstract void printAbstractTi2();
}


