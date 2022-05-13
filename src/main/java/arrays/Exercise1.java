package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {

    public static void
    main(String[] args) {

        ArrayList items = new ArrayList();

        int[] myIntArray = new int[100];
        int[] myIntArray2 = {1, 44, 22, 100, 41, 28};
        myIntArray[3] = 50;
        System.out.println(myIntArray[3]);

        double[] myDoubleArray = new double[22];
        double[] myDoubleArray2 = {132.111, 44.22, 22, 100, 41.99, 28.4612};
        myDoubleArray[3] = 1000.22;

        Scanner scanner = new Scanner(System.in);

//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 2;
//            myIntArray[i] = scanner.nextInt();
//            System.out.println("The value at index " + i + " is " + myIntArray[i]);
//        }
//        int[] myIntArray3 = new int[4];
//        myIntArray3[3] = 1000;


        String[] myStringArray = new String[44];
        boolean[] myBooleanArray = new boolean[2];
        Boolean[] myBooleanArray1 = new Boolean[2];


        Scanner scanner1 = new Scanner(System.in);
        int[] myIntArray5 = new int[5];
        for (int i = 0; i < myIntArray5.length; i++) {
            myIntArray5[i] = scanner1.nextInt();
            System.out.println("value at index: " + i + " has a value of " + myIntArray5[i]);
        }

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < myIntArray5.length - 1; i++) {
                if (myIntArray5[i + 1] < myIntArray5[i]) {
                    int myTempValue = myIntArray5[i];
                    myIntArray5[i] = myIntArray5[i + 1];
                    myIntArray5[i + 1] = myTempValue;
                    flag = true;
                }
            }
        }
        for (int i = 0; i < myIntArray5.length; i++) {
            System.out.println("Value of array is: " + myIntArray5[i]);
        }
    }


}
