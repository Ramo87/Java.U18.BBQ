package abstractClasses.knowledge.inheritance.testInterface;


public interface TestInterface {
    /**
     * ab java 8 würde die möglichkeit von default und static methode hinzufügen;
     * alle Interface-methoden Typen wären abstract default, static sind automatisch public
     */
    default void print() {
        System.out.println( "new test().printStatic()- ");
    }

    static void printStatic() {
        System.out.println( "TestInterface.printStatic() - statischer Aufruf aus  dem Interface!" );

    }

    abstract void printAbstract();
}
