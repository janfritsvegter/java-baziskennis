package jfv;

//import jfv.VierOpEenRij.VierOpEenRij;
//import jfv.higherlower.HigherLowerGame;
import jfv.blackjack.BlackJackGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Games game;

        game = createGame();

        String nameGame = game.getGameName();
        System.out.println(nameGame);


    }
    public static Games createGame(){
        Scanner inputScanner = new Scanner(System.in);
        Random random = new Random();

        BlackJackGame game = new BlackJackGame(inputScanner,random);
        return game;
    }
}
