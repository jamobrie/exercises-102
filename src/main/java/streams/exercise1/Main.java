package streams.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> myListString = Arrays.asList(
                "A22", "B31", "G44",
                "g72",
                "F88", "L99", "G71", "G22",
                "G1");

        List<String> myNewList = new ArrayList<>();

        myListString
                .stream()
                .map(String::toUpperCase) // --- Convert stream to upperCase .... For manipulating input essentially
                .filter(s -> s.startsWith("G")) // ---> Filter numbers that only start with G ....... A predicate
                .sorted() // ---> Sorts by desc .... default
                .forEach(System.out::println); // ---> A regular forEach, but from the Stream class
                    //argument accepted, but no value returned .... so ... it's mapped to the consumer of forEach
        //There's nothing to pass on because the forEach does not return anything ---> Known as a terminal Operation (void or non-stream result)


        //.peak method can print each line without terminating the chain ---> intermediate operation
        //.flatMap ---> To flatten nested lists
        //collect ---> terminal operation
        //reduce ---> BI Function ---> 2 arguments
        //ifPresent ---> optional result

        //Stream operations are lazily executed ... nothing will happen until terminal operator is called


        //intermediate expressions ---> Don't force end of chain

//        myListString.forEach(number -> {
//            if (number.startsWith("G")) {
//                myNewList.add(number);
//            }
//        });
//
//        myNewList.sort((String s1, String s2) -> s1.compareTo(s2));
//        myNewList.forEach((String s) -> System.out.println(s));

    }
}
