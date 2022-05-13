package whileLoops;

public class WhileExercises {

    public static void main(String[] args) {

        boolean isFlag = true;
        int count = 0;
        while (isFlag) {
            System.out.println("While still executing as the state of flag is: " + isFlag);

            for (int i = 0; i < 100; i++) {
                if (i == 97) {
                    isFlag = false;
                }
            }
        }

//        while (condition) {
//            //statement
//            //count ++
//        }

    }


}
