package jfv.novi;

public class StringReplacePosition {
    public static void main(String[] args) {
        String test = "abcdefghij";
        int i = 4;
        char rep = 'q';
        System.out.println(test);
        StringBuilder sb = new StringBuilder(test);

        // replace character at the specified position
        sb.setCharAt(i , rep);
        test = sb.toString();

        // print the modified string
        System.out.println(test);
    }
}

