package jfv.basis;

import java.util.Scanner;

public class Input {
     public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            boolean inputSucces;
            int min = 5;
            int max = 20;
            String temp = "x";
            int temp2 = 1 ;

            inputSucces = false;
            while (!inputSucces){
                System.out.println("voer iets in");
                temp = input.nextLine();
                try {
                    temp2 = Integer.parseInt(temp);
                    if(temp2>=min && temp2 <=max){
                        inputSucces = true;
                    }
                    else {
                        System.out.println("Het getal moet wel tussen de " + min + " en de " + max + " liggen");
                    }
                }catch (Exception e){
                    System.out.println(e);
                    System.out.println("Het moet wel een  geheel getal zijn");
                    System.out.println("En het getal moet wel tussen de " + min + " en de " + max + " liggen");
                }

            }
            System.out.println(temp2);
    }
}
