package edu.bbq.u18.chat.common.knowledge.inheritance.test2;

import edu.bbq.u18.chat.common.knowledge.inheritance.test.C;

public class TestDefaultVSProtectedVisibility extends C {

    private int protectedVisibleInstanceField =2000;

    public TestDefaultVSProtectedVisibility(){
    super("Test");

    System.out.println("super.protectedVisibleInstanceField = " + super.protectedVisibleInstanceField);
    System.out.println("super.protectedVisibleInstanceField = " + this.protectedVisibleInstanceField);

    this.protectedVisibleInstanceField = 10;
        System.out.println();
        System.out.println("super.protectedVisibleInstanceField = " + super.protectedVisibleInstanceField);
        System.out.println("super.protectedVisibleInstanceField = " + this.protectedVisibleInstanceField);

        super.protectedVisibleMethodFromClassA();

        this.protectedVisibleMethodFromClassA();

    }

   public static void main(String [] args) {
        new TestDefaultVSProtectedVisibility();
   }

    @Override
    public void protectedVisibleMethodFromClassA(){
        System.out.println("protected visible method from class a overriten in class testDefaultVSprotectedVisibility");
    }


    @Override
    public void publicVisibleMethodFromClassA(){
        System.out.println("public visible method from class a overriten in class testDefaultVSprotectedVisibility");
    }

    @Override
    public String toString(){
        return "Klasse: testDefaultVSProtectedVisibility";
    }
}
