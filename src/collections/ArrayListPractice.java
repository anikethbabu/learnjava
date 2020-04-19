package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Satish");
        names.add("Aniketh");
        names.add("Kubi");
        names.add("Anika");
        names.add("Buchulka");

        for (String name : names)
        {
            System.out.println(name);
        }
        Collections.sort(names);
        names.remove(1);
        for (int i = 0; i < names.size() ; i++) {
            System.out.println(names.get(i));

        }
    }
}

