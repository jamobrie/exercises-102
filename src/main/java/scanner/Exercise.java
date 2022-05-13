package scanner;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sumOfCount = 0;
        while (counter < 10) {
            if (scanner.hasNextInt()) {
                sumOfCount += scanner.nextInt();
                counter += 1;
            } else {
                System.out.println("Invalid number");
            }
        }
        System.out.println(sumOfCount);
        scanner.close();
    }


}
