package jfv.basis;

public abstract class AbstractSuperClass {

    //empty constructor
    public AbstractSuperClass() {
    }

    public void situatie_1b(){
        System.out.println("situatie_1b SuperClass");
    }
    public void situatie_1c(){
        System.out.println("situatie_1c SuperClass");
    }

    public void situatie_1d(){
        System.out.println("situatie_1d SuperClass");
    }

    public void situatie_1e(){
        System.out.println("situatie_1e SuperClass");
    }

    public void situatie_1f(){
        System.out.println("situatie_1e SuperClass");
    }
    public String situatie_1f(int temp){
        for (int i = 0; i < temp; i++) {
            System.out.println("situatie_1e SuperClass");
        }
        return "asdas";
    }

}
