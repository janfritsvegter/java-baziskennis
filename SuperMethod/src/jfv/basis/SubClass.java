package jfv.basis;

import java.util.ArrayList;
import java.util.List;

public class SubClass extends AbstractSuperClass {

    // empty constructor
    public SubClass() {
    }

    public void situatie_1a(){
        System.out.println("situatie_1a SubClass");
    }

    public void situatie_1b(){
        System.out.println("situatie_1b SubClass");
    }

    public void situatie_1d(){

            System.out.println("situatie_1d SubClass!!!!");

    }

    public String situatie_1e(int i){
        for (int j = 0; j < i; j++) {
            System.out.println("situatie_1e SubClass");
        }
        return "situatie_1e SubClass";
    }

    public String situatie_1f(int temp){
        for (int i = 0; i < temp; i++) {
            System.out.println("situatie_1f SubClass");
        }
        return "asdas";
    }

}
