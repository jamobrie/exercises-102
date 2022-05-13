package dataConversion;

public class unicode {

    public static void main(String[] args) {

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen");
        }

        int number1 = 200;
        int number2 = 13;
        int remainder = number1 % number2;
        System.out.println("remainder is: " + remainder);

        int number4 = 200;
        int number5 = 13;
        int remainder2 = number4 * number5;
        int remainder3 = number4 *= number5;
        System.out.println("remainder is: " + remainder2);
        System.out.println("remainder is: " + remainder3);

        char myChar = 'D';
        char myUniCodeChar = '\u0044'; //See unicode lookup table
        System.out.println("mychar: " + myChar + " has the same value as myUniCodeChar: " + myUniCodeChar);
    }
}
