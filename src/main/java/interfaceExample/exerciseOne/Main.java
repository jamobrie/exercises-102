package interfaceExample.exerciseOne;

public class Main {

    public static void main(String[] args) {
        ITelephone timsHousePhone;
        timsHousePhone = new DeskPhone(123456);
        timsHousePhone.powerOn();
        timsHousePhone.callPhone(123456);
        timsHousePhone.answer();

        ITelephone timsPersonalPhone;
        timsPersonalPhone = new MobilePhone(24565);
        timsPersonalPhone.powerOn();
        timsPersonalPhone.callPhone(24565);
        timsPersonalPhone.answer();

    }
}
