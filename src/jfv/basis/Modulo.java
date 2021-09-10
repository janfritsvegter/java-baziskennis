package jfv.basis;

public class Modulo {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(
                      i + " mod 1 = " + i % 1 + " "
                    + i + " mod 2 = " + i % 2 + " "
                    + i + " mod 3 = " + i % 3 + " "
                    + i + " mod 4 = " + i % 4);
        }
    }
}
