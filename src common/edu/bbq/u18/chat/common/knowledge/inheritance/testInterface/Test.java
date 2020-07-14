package edu.bbq.u18.chat.common.knowledge.inheritance.testInterface;

/**
 * Created by Loky on 13/07/2020.
 */
public class Test implements TestInterface, TestInterface2 {

    public Test(){
        this.print();
        this.printTi2();
        /* default void print() */

    }

    public static void main(String[] args){
        new Test();
    TestInterface.printStatic(  );
    }

    @Override
    public void printAbstract(){

    }

    @Override
    public void printAbstractTi2(){

}
}
