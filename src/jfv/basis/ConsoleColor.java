package jfv.basis;

public class ConsoleColor {
    public static void main(String[] args) {
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";

        String TEXT_RESET = "\u001B[0m";
        String TEXT_BLACK = "\u001B[30m";
        String TEXT_RED = "\u001B[31m";
        String TEXT_GREEN = "\u001B[32m";
        String TEXT_YELLOW = "\u001B[33m";
        String TEXT_BLUE = "\u001B[34m";
        String TEXT_PURPLE = "\u001B[35m";
        String TEXT_CYAN = "\u001B[36m";
        String TEXT_WHITE = "\u001B[37m";

        String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        String ANSI_RED_BACKGROUND = "\u001B[41m";
        String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        String ANSI_BLUE_BACKGROUND = "\u001B[44m";
        String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
        String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        String ANSI_WHITE_BACKGROUND = "\u001B[47m";

        System.out.println("test");
        System.out.println(TEXT_RED + "rode tekst");
        System.out.println(TEXT_BLACK + "zwarte tekst");
        System.out.println(TEXT_GREEN + "groene tekst");
        System.out.println(TEXT_YELLOW + "gele tekst");
        System.out.println(TEXT_BLUE + "blauwe tekst");
        System.out.println(TEXT_PURPLE + "paarse tekst");
        System.out.println(TEXT_CYAN + "cyan tekst");
        System.out.println(TEXT_WHITE + "witte tekst");
        System.out.println(TEXT_RESET + "reset");

        System.out.println(ANSI_CYAN_BACKGROUND + TEXT_RED + "rode tekst" );
        System.out.println(ANSI_WHITE_BACKGROUND + TEXT_BLACK + "zwarte tekst" + TEXT_RESET);
        System.out.println(ANSI_PURPLE_BACKGROUND + TEXT_GREEN + "groene tekst" + TEXT_RESET);
        System.out.println(ANSI_BLUE_BACKGROUND + TEXT_YELLOW + "gele tekst" + TEXT_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND + TEXT_BLUE + "blauwe tekst" + TEXT_RESET);
        System.out.println(ANSI_RED_BACKGROUND + TEXT_PURPLE + "paarse tekst" + TEXT_RESET);
        System.out.println(ANSI_GREEN_BACKGROUND + TEXT_CYAN + "cyan tekst" + TEXT_RESET);
        System.out.println(ANSI_BLACK_BACKGROUND + TEXT_WHITE + "witte tekst" + TEXT_RESET);
        System.out.println(TEXT_RESET + "reset");
        System.out.println("" + " tekst");
    }

}