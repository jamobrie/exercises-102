package dataConversion;

public class TernaryExample {


    public static void main(String[] args) {

        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        System.out.println("wasCar state is: " + wasCar);

        int ageOfClient = 16;
        boolean isEighteenOrOver = ageOfClient > 18 ? true : false;
        System.out.println("Is Client over 18? ---> " + isEighteenOrOver);

        double number1 = 20.00;
        double number2 = 80.00;
        double total = (number1 + number2) * 100.00;
        double remainder = total % 42.00;
        System.out.println("remainder is " + remainder);
        boolean isRemainderZero = remainder == 0 ? true : false;
        System.out.println("Remainder boolean value is " + isRemainderZero);

    }

}
