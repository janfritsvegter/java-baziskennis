package jfv.basis;
// https://www.educative.io/edpresso/how-to-generate-random-numbers-in-java
import java.util.Random;

public class IfElseAwitch {
    public static void main(String[] args) {
        int i = 0;
        int minimum = 25;
        int maximum = 30;
        int outsideRange =0;
        int[] deviding = new int[6]; // int[0] -> 25 int[1] -> 26 int[2] -> 27 int[3] -> 28 int[4] -> 29 int[5] -> 30
        for (i=0; i<=5; i++){ // all values from the deviding array put to 0
            deviding[i]=0;
        }
        for (i=1; i<= 10000; i++){
            int number = randUtil(minimum,maximum); // use method randUtil
            switch(number){
                case 25:
                    deviding[0]++;
                    break;
                case 26:
                    deviding[1]++;
                    break;
                case 27:
                    deviding[2]++;
                    break;
                case 28:
                    deviding[3]++;
                    break;
                case 29:
                    deviding[4]++;
                    break;
                case 30:
                    deviding[5]++;
                    break;
                default: outsideRange++;
            }
        }

        System.out.println("25 " + deviding[0]);
        System.out.println("26 " + deviding[1]);
        System.out.println("27 " + deviding[2]);
        System.out.println("28 " + deviding[3]);
        System.out.println("29 " + deviding[4]);
        System.out.println("30 " + deviding[5]);
        System.out.println("Outside rage " + outsideRange);

        System.out.println();
        System.out.println();

        outsideRange=0;
        for (i=0; i<=5; i++){ // all values from the deviding array put to 0
            deviding[i]=0;
        }
        for (i=1; i<= 10000; i++){
            int number = randUtil2(minimum,maximum); // now use method randUtil2
            switch(number){
                case 25:
                    deviding[0]++;
                    break;
                case 26:
                    deviding[1]++;
                    break;
                case 27:
                    deviding[2]++;
                    break;
                case 28:
                    deviding[3]++;
                    break;
                case 29:
                    deviding[4]++;
                    break;
                case 30:
                    deviding[5]++;
                    break;
                default:
                    outsideRange++;
            }
        }

        System.out.println("25 " + deviding[0]);
        System.out.println("26 " + deviding[1]);
        System.out.println("27 " + deviding[2]);
        System.out.println("28 " + deviding[3]);
        System.out.println("29 " + deviding[4]);
        System.out.println("30 " + deviding[5]);
        System.out.println("Outside rage " + outsideRange);

        System.out.println();
        System.out.println();

        outsideRange = 0;
        for (i=0; i<=5; i++){ // all values from the deviding array put to 0
            deviding[i]=0;
        }

        for (i=1; i<= 10000; i++){
            int number = randUtil3(minimum,maximum); // now use method randUtil3
            if(number == 25){ deviding[0]++; }
            else if(number == 26){ deviding[1]++; }
            else if(number == 27){ deviding[2]++; }
            else if(number == 28){ deviding[3]++; }
            else if(number == 29){ deviding[4]++; }
            else if(number == 30){ deviding[5]++; }
            else { outsideRange++; }

            }
        

        System.out.println("25 " + deviding[0]);
        System.out.println("26 " + deviding[1]);
        System.out.println("27 " + deviding[2]);
        System.out.println("28 " + deviding[3]);
        System.out.println("29 " + deviding[4]);
        System.out.println("30 " + deviding[5]);
        System.out.println("Outside rage " + outsideRange);
    }

    // with import java.util.Random;
    //min is included and max is excluded
    public static int randUtil(int min, int max){
        int randInt = 0;
        if(min<max){ // the max vallue has to be more then the min vallue
            Random rand = new Random();
            // first calulate the upperbound
            int upperbound = max - min;
            randInt = rand.nextInt(upperbound); // randam gives a number >=0 and <upperbound so 0 is included and upperbound is exluded
            // add the min so that it is between nmin and max
            randInt = randInt + min; // in this case we have a number >= min and < max so min is included and max is excluded
        }
        return randInt;
    }

    // with import java.util.Random;
    // min is excluded and max is included
    public static int randUtil2(int min, int max) {
        int randInt = 0;
        if (min < max) { // the max vallue has to be more then the min vallue
            Random rand = new Random();
            // first calulate the upperbound
            int upperbound = max - min;
            randInt = rand.nextInt(upperbound) + 1; // randam gives a number >0 and <=upperbound so 0 is excluded and upperbound is included
            // add the min so that it is between nmin and max
            randInt = randInt + min; // in this case we have a number >= min and < max so min is included and max is excluded
        }
        return randInt;
    }
    // with import java.util.Random;
    // min is included and max is included
    public static int randUtil3(int min, int max){
        int randInt = 0;
        if(min<max){ // the max vallue has to be more then the min vallue
            Random rand = new Random();
            // first calulate the upperbound
            int upperbound = max - min +1; // to include both endpoints we have to make the range bigger by adding 1 to the upperbound
            randInt = rand.nextInt(upperbound); // randam gives a number >=0 and <upperbound so 0 is included and upperbound is exluded
            // it is no problem that upperbound is excluded because we made it 1 bigger
            // add the min so that it is between nmin and max
            randInt = randInt + min; // in this case we have a number >= min and < max so min is included and max is included
        }
        return randInt;
    }
}





//
//class GenerateRandom {
//    public static void main( String args[] ) {
//        int min = 50;
//        int max = 100;
//
//        //Generate random int value from 50 to 100
//        System.out.println("Random value in int from "+min+" to "+max+ ":");
//        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
//        System.out.println(random_int);
//    }
//}
//
//import java.util.concurrent.ThreadLocalRandom;
//class GenerateRandom {
//    public static void main( String args[] ) {
//        // Generate random integers
//        int int_random = ThreadLocalRandom.current().nextInt();
//
//        // Print random integers
//        System.out.println("Random Integers: " + int_random);
//
//        // Generate Random doubles
//        double double_rand = ThreadLocalRandom.current().nextDouble();
//
//        // Print random doubles
//        System.out.println("Random Doubles: " + double_rand);
//
//        // Generate random booleans
//        boolean boolean_rand = ThreadLocalRandom.current().nextBoolean();
//
//        // Print random booleans
//        System.out.println("Random Booleans: " + boolean_rand);
//    }
//}
