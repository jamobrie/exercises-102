package dataConversion;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TernaryExercises {


    public static void main(String[] args) {
        boolean isFlag = false;
        boolean outcome = isFlag ? true : false;
        System.out.println("outcome is: " + outcome);

        int age = 44;
        boolean isAgeOver21 = age > 45 ? true : false;
        System.out.println("Is age greater than 44? ... " + isAgeOver21);
        printMegaBytesAndKiloBytes(2800);

        //Decimal rounding to 3 places
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabyteSize = kiloBytes / 1024;
        int kilobytesSize = kiloBytes % 1024;
        System.out.println(kiloBytes + "KB = " + megabyteSize + " MB and" + kilobytesSize + " KB");
    }

}
