package interfaceExample.exerciseTwo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> monsterList = new ArrayList<>();
        monsterList.add("Orc");

        ISaveable monsterOne = new Monster();
        monsterOne.fetchArray();
        monsterOne.populateArray(monsterList);
    }

}
