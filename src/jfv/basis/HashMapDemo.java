package jfv.basis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> persons = new HashMap<>();

        persons.put(1,"Johanna vsn Olden Bsrneveld");
        persons.put(1, "Sjaak Polak");
        persons.put(2, "Coen Jansen");
        persons.put(3, "Hendrik El-Mecky");

        System.out.println("De persoon met BSN-nummer 1 is: " + persons.get(1));
        System.out.println("De persoon met BSN-nummer 2 is: " + persons.get(2));

        persons.put(33, "Onbekend Doe");
        System.out.println("De persoon met BSN-nummer 33 is: " + persons.get(33));
        System.out.println("Aantal entries in persons: " + persons.size());
        persons.remove(33);
        System.out.println("Aantal entries in persons: " + persons.size());
        persons.clear();
        System.out.println("Aantal entries in persons: " + persons.size());
         /*
         De HashMap lijkt in gebruik heel erg op de ArrayList en de
         Array. Sommige methodes heten hetzelfde, zoals size() en clear().
         Sommige heten hetzelfde, maar werken net iets anders, zoals
         remove() en get(). En sommige heten totaal anders zoals
         de put()-methode.


          Het verschil met ArrayList bij remove() en get() is, dat je niet de
          positie meegeeft, maar de waarde van de key. Om Objecten toe te
          voegen aan de HashMap, gebruik je de put()-methode. Deze methode
          verwacht als parameters de key en de value. Je kunt dus geen
          objecten aan een Map toevoegen zonder ook een key mee te geven.
          */




    }
}
