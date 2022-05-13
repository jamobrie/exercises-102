package arrayList.exercise2;

import java.util.ArrayList;

public class MobilePhone {
    public MobilePhone() {
        this.contactList = new ArrayList<Contacts>();
    }

    private ArrayList<Contacts> contactList;

    public void storeContact(long contact, String name) {
        Contacts contacts = new Contacts("qadawd", 132123);
        contactList.add(contacts);
    }

    public void modifyContact(String oldName, String newName) {
        int contactIndex = contactList.indexOf(oldName);
        contactList.get(contactIndex).setName(newName);
    }

    public void removeContact(String name) {
        contactList.remove(contactList.indexOf(name));
    }


}
