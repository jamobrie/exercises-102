package doWhileLoops;

public class DoWhileLoopExercises {

    public static void main(String[] args) {
        int count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count > 100) {
                break;
            }

        } while (count != 6);

        //Structure
//        do {
//            //statements
//        } while (condition);


    }


}
