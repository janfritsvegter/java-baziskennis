package jfv.novi;

public class MethodInMethod {
    public static String bla = "sdfsdf";
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        System.out.println("Deze regel komt uit methode1");
        method2();
    }

    public static void method2(){
        System.out.println(bla);
        System.out.println("Deze regel komt uit methode2");
    }
}
