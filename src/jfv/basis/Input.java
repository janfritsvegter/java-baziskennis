package jfv.basis;

import java.util.Scanner;

// the problem with next input.nextInt(); is that it has no return so
// if you do a input.nextLine(); after a input.nextInt(); the input.nextLine(); is passed
// input.nextLine(); has a return and less trouble with input
// if you do input.nextInt(); you have immediately the datatype you want without recasting
// but you have to handle the input errors and fix the return if necessary
// if you do an input.nextLine(); you have less or no input errors to handle
// but you need to recast and handle those errors

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


            int inputNumber = inputInteger(10,25,15,5,input);
         System.out.println(inputNumber);
    }

    // Gives an integer back between min and max endpoints included
    // and after a max amount of tries a default vallue
    public static int inputInteger(int min, int max, int def, int maxTries, Scanner input) {
        int noTries = 1;
        boolean inputSucces = false;
        int inputVallue = 1;
        while (!inputSucces) {
            if (noTries == 1) {
                System.out.println("Je moet eem geheel getal invoeren tussen de " + min + " en de " + max);
            } else {
                System.out.println("Je moet eem geheel getal invoeren tussen de " + min + " en de " + max + " probeer opnieuw");
            }

            // System.out.println(noTries);
            try {
                inputVallue = input.nextInt();
                if (inputVallue >= min && inputVallue <= max) {
                    inputSucces = true;
                }

            } catch (Exception e) {
                // System.out.println(e);
                // this line is here to get to the next input.nextInt();
                input.next();
            }

            if (!inputSucces) {
                if (noTries >= maxTries) {
                    inputVallue = def;
                    inputSucces = true;
                }
            }
            noTries++;
        }
        return inputVallue;
    }
}
