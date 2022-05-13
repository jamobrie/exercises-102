package arrayList.exercise2;

import java.util.Scanner;

public class Main {

    private static Contacts myContacts = new Contacts("awd", 123);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        //store
        //modify
        //remove
        //query

        Scanner scanner = new Scanner(System.in);
        boolean quit = true;
        while (quit) {

            switch (scanner.nextInt()) {
                case 1:
                    mobilePhone.storeContact(scanner.nextLong(), scanner.nextLine());
                    break;
                case 2:
                    mobilePhone.modifyContact(scanner.nextLine(), scanner.nextLine());
                    break;
                case 3:
                    mobilePhone.removeContact(scanner.nextLine());
                    break;
                case 4:
                    //query
                    break;
                case 5:
                    quit = false;
                    break;
            }

        }
    }

}
