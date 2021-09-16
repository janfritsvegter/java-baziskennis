package jfv.basis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
Arraylist
Declare and initialize use Arrays.asList
Length = .size()
at position use .get(position)
add = .add(position , vallue) no position means end of the list
add multiple vallues = .addAll
delete = .remove()
empty list = .clear()
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        for(int i=0;i< numbers.size();i++){
            System.out.println("position " + i + " gives " + numbers.get(i));
        }

        List<String> firstNames = new ArrayList<>(Arrays.asList("Joop","Piet","Klaas","Karel"));
        for(int i=0;i< firstNames.size();i++){
            System.out.println("position " + i + " gives " + firstNames.get(i));
        }
        firstNames.add(1, "Annelies");
        firstNames.add("Janneke");
        for(int i=0;i< firstNames.size();i++){
            System.out.println("position " + i + " gives " + firstNames.get(i));
        }
        firstNames.remove(3);
        firstNames.remove(firstNames.size()-1); // remove last .size()-1
        for(int i=0;i< firstNames.size();i++){
            System.out.println("position " + i + " gives " + firstNames.get(i));
        }

        numbers.clear();
        for(int i=0;i< numbers.size();i++){
            System.out.println("position " + i + " gives " + numbers.get(i));
        }
        System.out.println("oh");
        numbers = Arrays.asList(1,2,3,4,5,6,7);
        for(int i=0;i< numbers.size();i++){
            System.out.println("position " + i + " gives " + numbers.get(i));
        }
        firstNames.addAll(Arrays.asList("Klaas" , "Janneke" , "Petra" , "Johan"));
        for(int i=0;i< firstNames.size();i++){
            System.out.println("position " + i + " gives " + firstNames.get(i));
        }

        List<Integer> numberslist = new ArrayList<>(Arrays.asList(5, 12, 9, 3, 15, 88));
        // Collections.addAll(numbers, 12, 15, 88); // should add 12 15 88
        try {
            Collections.addAll(numberslist, 12, 15, 88);
            // when you use the name numbers for the Arraylist
            // you get java.lang.UnsupportedOperationException
            // when you use numberslist as name no problem
            // probably numbers is used in Collection for something
        }
        catch(Exception e){
            System.out.println(e);
        }
        for(int i=0;i< numberslist.size();i++){
            System.out.println("position " + i + " gives " + numberslist.get(i));
        }



    }

}
