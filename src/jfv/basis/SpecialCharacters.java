package jfv.basis;

import java.text.DecimalFormat;

public class SpecialCharacters {
    public static void main(String[] args) {

        String[] suits = new String[4];
        suits[0] = "diamonds " + "\u2666 " + "red";
        suits[1] = "spades " + "\u2660 " + "black";
        suits[2] = "hearts " + "\u2665 " + "red";
        suits[3] = "clubs " + "\u2663 " + "black";

        for (String suit: suits) {
            System.out.println(suit);
        }

        for (int i = 0; i < 100000; i++) {
            int aantalGetallenOpRij = 50;
            DecimalFormat df = new DecimalFormat("00000");
            String n = df.format(i);
            char c= (char)(i);
            if(i%aantalGetallenOpRij!=0){
                System.out.print( n + " " + c + " | " );
            }else{
                System.out.println(n);
            }
        }


    }
}
