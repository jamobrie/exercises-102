package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {

    private static List<String> stringList = Arrays.asList("Focus", "Farg");
    private static int[] myIntArray;
    private static ArrayList<String> arrayListOfString = new ArrayList<String>();

    public static void main(String[] args) {
        arrayListOfString.add("Jimbo");
        arrayListOfString.add("Siobhan");
        arrayListOfString.add("Mark");
//        arrayListOfString.set(1, "12312");
//        arrayListOfString.remove(1);
//        stringList.set(0, "jimbo123");
//        stringList.set(1, "jimbo123456");
//        stringList.add("Ford");
//        stringList.add("Fiesta");
//        stringList.remove(1);
        int indexValue = arrayListOfString.indexOf("Mark");
        System.out.println("We can lookup index values using this: " + indexValue);
    }


}
