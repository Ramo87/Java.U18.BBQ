package abstractClasses.knowledge.polymorphie;

/**
 * Created by Loky on 14/07/2020.
 */
public class Test {

    public static void main(String []args){
        Saeugetier s1 = new Hund(); //s1 este referinta, de tip Saegetier, care duce catre un obiect de Hund. Polymorphie //
        Saeugetier s2 = new Katze(); //

        //Katze k1 = new Saeugetier(); kompilier nicht, saeugetier ist viel kleiner als katze;



        System.out.println("Dieser Hund ist ein  " + s1.showSpecies());
        System.out.println("Diese Katze ist ein " + s2.showSpecies());



    }


}
