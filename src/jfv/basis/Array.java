package jfv.basis;

public class Array {
    public static void main(String[] args) {
        String[][] board = new String[4][4];
        System.out.println("De lengte van het board is " + board.length);
        System.out.println("De lengte van een kolom is " + board[0].length);

        String[] firstnames = {"Henk", "Piet", "Harry", "Sjaak", "Peter"};
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        for(int i=0;i<firstnames.length;i++){
            System.out.println(firstnames[i]);
        }
        System.out.println();
        System.out.println();
        for(int i=0;i< numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
