package forLoops;

public class ForLoopExercise {

    public static void main(String[] args) {
        for (int i = 0; i < 2002; i++) {
            System.out.println("The contestant this iteration is " + i);
            if (i == 1040) {
                System.out.println("Contestant 1040 has won!");
                break;
            }
        }

        String abc123 = String.format("%.2f", 100.44444);
        System.out.println(abc123);

        int sumOfThree = 0;
        int sumOfFive = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0) {
                System.out.println("Value of three divisible: " + i);
                sumOfThree += i;
            }

            if (i % 5 == 0) {
                System.out.println("Value of three divisible: " + i);
                sumOfThree += i;
            }
        }

        loopExercise1();

    }

    public static void loopExercise1() {
        //To find last digit of a number ---> %10
        int smallNumber = 40;
        int remainderOfSmallNumber = smallNumber % 50;
        System.out.println(remainderOfSmallNumber);
    }

}
