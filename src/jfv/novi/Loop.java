package jfv.novi;

public class Loop {
    public static void main(String[] args) {
        int i;

        // voor een for loop maakt het niet uit wat de waarde van i is want die wordt bij het begin van de loop op de beginwaarde gezet

        for (i=1;i<=5;i++){
            System.out.println("foor loop " + i);
        }
        // na de for loop
        System.out.println("De waarde van i na de for loop is " + i);

        // bij een while loop maakt het wel uit wat de waarde van i is want die wordt niet automatisch op de beginwaarde gezet
        i=1;
        while (i<=5){
            System.out.println("while loop " + i);
            i++;
        }
        // na de while loop
        System.out.println("De waarde van i na de while loop is " + i);

        // bij een do while loop maakt het wel uit wat de waarde van i is want die wordt niet automatisch op de beginwaarde gezet
        // plus dat de loop ongeacht de waarde van i altijd 1 keer uitgevoerd wordt
        i=1;
        do {
            System.out.println("do while loop " + i);
            i++;
        }
        while (i<=5);
        System.out.println("De waarde van i na de do while loop is " + i);

        i=8;
        while (i<=5){
            System.out.println("tweede while loop " + i);
            i++;
        }

        i=8;
        do {
            System.out.println("rweede do while loop " + i);
            i++;
        }
        while (i<=5);
        System.out.println("De waarde van i na de tweede do while loop is " + i);
    }
}
