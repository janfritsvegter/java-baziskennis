package jfv.basis;

import java.util.*;

// Stack is singronized only one shread can acces stack at a time
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        int stackSize= 0;

        stack.push("one");
        stack.push("two");
        stack.push("three");

        // size shows you the size of the stack
        System.out.println("the size is " + stack.size());

        // peek shows the elemant on the top of the stack but leaves it there
        //pop returns the element on the top of the stack and removes it.
        //If you use a for loop untill stack.size() and in the loop you do stack.pop() the size is getting smaller
        stackSize = stack.size();
        for (int i = 1; i <= stackSize; i++) {
            System.out.println("peek " + stack.peek());
            System.out.println("the stack now " + stack);
            System.out.println("pop " + stack.pop());
            System.out.println("the stack now " + stack);
        }

        // the index returned by search is the index from the top of the stack (-1 = not found)
        stack.push("one");
        System.out.println("after pushing our first item one the index of one is " + stack.search("one"));
        stack.push("two");
        System.out.println("after pushing our second item two the index of one is " + stack.search("one"));
        stack.push("three");
        System.out.println("after pushing our third item three the index of one is " + stack.search("one"));
        System.out.println("after pushing our third item three the index of two is " + stack.search("two"));
        System.out.println("after pushing our third item three the index of three is " + stack.search("three"));
        System.out.println("the index of ABC non existing element is " + stack.search("ABC"));

        System.out.println(stack);
        //three ways of iterating a stack iterating goes from bottom to top the same order as they were put in
        // standard iterator you need to import the java.util.Iterator
        Iterator<String> iterator = stack.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // after iterating the stack stays the same
        System.out.println(stack);

        // standard for each loop we asign the elements to a variable and print the variable
        // no import necesary
        for(String element : stack){
            System.out.println(element);
        }
        // after iterating the stack stays the same
        System.out.println(stack);

        // using the java streams API and to the foreach method you pass a java lamda expression
        stack.stream().forEach((element) -> {
            System.out.println(element);
        });
        // after iterating the stack stays the same
        System.out.println(stack);

        //use a stack to reverse elements in a string
        // first create a stack and a list
        Stack<String> stack_2 = new Stack<>();
        List<String> list = new ArrayList<>(Arrays.asList("one","two","three","four"));
        System.out.println(list);
        //the size of the list will get smaller as we remove items
        // we remove the first item index 0 and push it on the stack
        while(list.size()>0){
            stack_2.push(list.remove(0));
        }
        System.out.println(stack_2);
        while(stack_2.size()>0){
            list.add(stack_2.pop());
        }
        System.out.println(list);



    }
}
