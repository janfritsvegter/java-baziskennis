package jfv.basis;

public class MainClass {
    public static void main(String[] args) {
        Games game;
        game = createGame();

        game.testMethod(5);
    }

    public static Games createGame(){
        TicTacToe game = new TicTacToe();
        return game;
    }

}
