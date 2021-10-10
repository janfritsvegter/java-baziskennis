package jfv.basis;

public class TicTacToe implements Games{
    @Override
    public String testMethod(int repeater){
        for (int i = 0; i < repeater; i++) {
            System.out.println("Hij doet het");
        }
        return "Wow hij hoet het echt";
    }
}
