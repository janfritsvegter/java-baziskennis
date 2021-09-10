package jfv.novi;

import java.util.Random;

public class RandomInt {
    public static void main(String[] args) {
        int minimum = 25;
        int maximum = 35;
        int number = randMath(minimum,maximum);
        System.out.println(number);

        for(int i=1; i<100; i++) {
            double random_double = Math.floor(Math.random() * 10000);
            System.out.println(random_double);
        }

        double test = 4.7859;
        System.out.println(test);

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
    public static int randUtil2(int min, int max){
        int randInt = 0;
        if(min<max){ // the max vallue has to be more then the min vallue
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


    public static int randMath(int min, int max) {
       // System.out.println("Random value in int from "+min+" to "+max+ ":");
       int random_int = (int)Math.floor(Math.random());
       //*(max-min+1)+min
       // int random_int = (int)Math.floor(Math.random()*(max-min+1)+min)
       return random_int;

       /*
       Math.random() uses Random.nextDouble() internally.

       Random.nextDouble() uses Random.next() twice to generate a double that has approximately uniformly
       distributed bits in its mantissa, so it is uniformly distributed in the range 0 to 1-(2^-53).

       Random.nextInt(n) uses Random.next() less than twice on average- it uses it once, and
       if the value obtained is above the highest multiple of n below MAX_INT it tries again,
       otherwise is returns the value modulo n (this prevents the values above the highest
       multiple of n below MAX_INT skewing the distribution), so returning a value which
       is uniformly distributed in the range 0 to n-1.

       Prior to scaling by 6, the output of Math.random() is one of 2^53 possible
       values drawn from a uniform distribution.

       Scaling by 6 doesn't alter the number of possible values, and casting to an int then
       forces these values into one of six 'buckets' (0, 1, 2, 3, 4, 5), each bucket
       corresponding to ranges encompassing either 1501199875790165 or 1501199875790166
       of the possible values (as 6 is not a disvisor of 2^53). This means that for a
       sufficient number of dice rolls (or a die with a sufficiently large number of sides),
       the die will show itself to be biased towards the larger buckets.

       You will be waiting a very long time rolling dice for this effect to show up.

       Math.random() also requires about twice the processing and is subject to synchronization.

        */
  }
}
