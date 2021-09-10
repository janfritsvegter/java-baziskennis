package jfv.novi;

import java.util.Scanner;

public class UpercaseLowercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Voer een woord/zin in");
        String sentence = input.nextLine();

        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());

        String[] words = sentence.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i< words.length; i++){
            System.out.println(i + " " + words[i]);
            if(i<(words.length-1)){
                sb.append(Character.toUpperCase(words[i].charAt(0)));
                sb.append(words[i].substring(1));
                sb.append(" ");
            }
            else {
                sb.append(Character.toUpperCase(words[i].charAt(0)));
                sb.append(words[i].substring(1));
            }
        }

        System.out.println(sb);
/*
        StringBuffer buffer=new StringBuffer("hello");
        buffer.append("java");
        System.out.println(buffer);

        StringBuilder builder=new StringBuilder("hello");
        builder.append("java");
        System.out.println(builder);
*/

    }
}
