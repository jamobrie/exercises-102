package interfaceExample.exerciseTwo;

import java.util.ArrayList;

public class Player implements ISaveable {

    private ArrayList<ArrayList> stringArrayList;

    @Override
    public void populateArray(ArrayList stringList) {
        stringArrayList.add(stringList);
        System.out.println("Name of playable character is: " + stringList);
    }

    @Override
    public void fetchArray() {
        System.out.println("Name of all playable characters: " + stringArrayList.toString());
    }
}
