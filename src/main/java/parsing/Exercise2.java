package parsing;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {
        getLargestPrime(29);
//        getLargestPrime(1);
//        getLargestPrime(-1);
    }

    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        }
        isPrime(number);
        return calculateLargestPrimeFactor();
    }

    private static int calculateLargestPrimeFactor() {
        return 0;
    }

    //29
    public static void isPrime(int number) {

        int largestPrimeFactor;
        List<Integer> myListInt = new ArrayList<>();
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                myListInt.add(number);

            }
        }

        for (int j = 0; j < myListInt.size(); j++) {
            if (j == myListInt.size() - 1) {
                largestPrimeFactor = myListInt.get(j);
                System.out.println("largest number: " + largestPrimeFactor);
            }
        }
    }

}
