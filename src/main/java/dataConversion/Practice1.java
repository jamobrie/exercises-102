package dataConversion;

public class Practice1 {

    public static void main(String[] args) {
        int myValue = 10000;

        byte myOwnByte = 60;
        short myOwnShort = 2040;
        int myOwnInt = 1020;
        long myOwnLong = 50000L + (10 * (myOwnByte + myOwnShort + myOwnInt));
        System.out.println("long value is: " + myOwnLong);

        short myOwnShort2 = (short) (1000 + 10 * (myOwnByte + myOwnInt + myOwnShort));

        int myFavInt = 10;
        float myFavFloat = (float) 40.4;
        double myFavDouble = 40.433D;

        float myWeightPounds = 200.244F;
        double myWeightKg = myWeightPounds * 0.453592;
        System.out.println("my kg weight: " + myWeightKg);

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = myMinIntValue / 2;

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);


    }
}


