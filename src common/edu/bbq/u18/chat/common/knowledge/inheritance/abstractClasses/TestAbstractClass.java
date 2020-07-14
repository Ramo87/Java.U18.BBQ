package edu.bbq.u18.chat.common.knowledge.inheritance.abstractClasses;

/**
 * Created by Loky on 13/07/2020.
 */
public abstract class TestAbstractClass {

    void printTAC1() {
        System.out.println( "new test().printStatic()- TestAbstractenClasse!");
    }

    static void printStatic() {
        System.out.println( "TestInterface.printStatic() - statischer Aufruf aus der Interface!" );

    }

    abstract void printAbstractTAC1();
}


