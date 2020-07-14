package abstractClasses.knowledge.inheritance.abstractClasses;

/**
 * Created by Loky on 13/07/2020.
 */
public class Test extends TestAbstractClass
{
public Test(){
    this.printTAC1();
}
public static void main(String[] args){
    new Test();
    printStatic();
}
    @Override
    void printAbstractTAC1(){

    }
}
