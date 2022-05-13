package parsing;

public class ParseExercise {

    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println("numberAsString= " + numberAsString);

//        Integer.parseInt(x);
//        Boolean.parseBoolean(x);
//        Long.parseLong(x);
//        Float.parseFloat(x);
//        Short.parseShort(x);
//        Byte.parseByte(x);
//        Double.parseDouble(x);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }

}
