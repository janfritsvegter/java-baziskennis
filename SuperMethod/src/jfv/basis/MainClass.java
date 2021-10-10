package jfv.basis;

import java.util.ArrayList;
import java.util.List;

/*
Abstracte superClass
methodes in subclass

Situatie 1
object wordt direct aangemaakt als type subClass
methode situatie_1a() staat wel in subClass maar niet in superClass
    Deze wordt normaal uitgevoerd
methode situatie_1b() staat in beiden subclass en in superClass zonder @Override
    Hier wordt de methode uit de subclass uitgevoerd.
methode situatie_1c() staat wel in superClass niet in subclass
    Hier wordt de methode uit supperClass uitgevoerd.
methode staat in beiden maar met verschillende argumenten.


Situatie 2 object wordt gedeclareerd als superClass maar er wordt een object van de subClass via een methode toegekend

Situatie 3 object van subClass wordt in een List van Type superClass geplaatst
 */
public class MainClass {
    public static void main(String[] args) {

/*
        //Situatie 1
        SubClass testSub = new SubClass();
        testSub.situatie_1a();
        testSub.situatie_1b();
        testSub.situatie_1c();
        // testSub.situatie_1d(5);
        // String test = testSub.situatie_1e();
        // System.out.println(test);
        //java: situatie_1e() in jfv.basis.SubClass cannot override situatie_1e() in jfv.basis.AbstractSuperClass
        //  return type java.lang.String is not compatible with void
        String test = testSub.situatie_1e(5);
        System.out.println(test);
        // met veranderde argumenten werkt het wel.

        AbstractSuperClass testSuper;
        testSuper = createTestSuper();
        // testSuper.situatie_1a(); is niet beschikbaar want zit niet in superClass
        testSuper.situatie_1b();
        testSuper.situatie_1c();
        testSuper.situatie_1d();
*/

        List<AbstractSuperClass> testList = new ArrayList<>();

        SubClass testObjecta = new SubClass();
        testList.add(testObjecta);

        System.out.println("opletten");
        testList.get(0).situatie_1d();

/*

        AbstractSuperClass testObject;
        testObject = createTestSuper();
        testObject.situatie_1d();
        String doeiets = testObject.situatie_1f(5);
        System.out.println(doeiets);
*/




    }

    public static AbstractSuperClass createTestSuper() {
        SubClass testSub2 = new SubClass();
        return testSub2;
    }
}
