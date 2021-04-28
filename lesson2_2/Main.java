package lesson2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> mda = new ArrayList<>();
        mda.add("Hello");
        mda.add("Goodbye");
        mda.add("Hello");

        for (int i = 0; i < mda.size(); i++) {
            System.out.println(mda.get(i)+" ");
        }

        HashSet<String> noDupSet = new HashSet<>(mda);


        for (String r : noDupSet) {
            System.out.println(r + ": " + Collections.frequency(mda, r));
        }


    }

}
