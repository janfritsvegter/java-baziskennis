package jfv.basis;

import java.io.*;
import java.util.Scanner;

public class Filehandling {
    public static void main(String[] args) throws IOException {
        // This main method throws an IOExceptions if something goes wrong.
        // This exception can be handled on the place that this method is called
        // a little bit strange for a main method but ok
        // in case of any other method  it works
        // in this case we should use try and catch

        String scores = "PlayerA: 3 , PlayerB 9";

        // File objectvariabele de referentie naar de file.
        File scoresFile = new File("scores.txt");
        //FileWriter object opent het bestand.
        // kan ook 1 voor 1 de waarde van variabelen in een bestand opslaan.
        FileWriter fileWriter = new FileWriter(scoresFile);

        //Bufferwriter verzameld de informatie
        BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
        scores = "Piet 2";
        bufferWriter.write(scores);
        bufferWriter.newLine();
        scores = "Klaas 5";
        bufferWriter.write(scores);
        bufferWriter.newLine();
        scores = "Janneke 5";
        bufferWriter.write(scores);
        bufferWriter.newLine();
        scores = "Karel 4";
        bufferWriter.write(scores);
        bufferWriter.newLine();
        scores = "Frederieke 8";
        bufferWriter.write(scores);

        bufferWriter.close();

        // read from files
        // first we need a File object
        // then we need a Scanner  object to read the file object.
        try {
            File score = new File("scores.txt");
            Scanner myReader = new Scanner(score);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
