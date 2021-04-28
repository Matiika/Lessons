package lesson2_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionHome {
    private static final String[] words = {"A","B", "C", "A", "B","A"};

    private static HashSet<String> getWorlds (String[] arr){
        return new HashSet<>(Arrays.asList(arr));
    }

    private static HashMap<String, Integer> getWordsCount (String[] arr){
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            if (map.containsKey(word)){
                map.put(word,map.get(word)+1);
            } else {
                map.put(word,1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(getWorlds(words));
        System.out.println(getWordsCount(words));

        Phonebook phonebook = new Phonebook();

        phonebook.add("ivanov","ivanov phone 1", "ivanov mail 1");
        phonebook.add("pertov","pertov phone 1", "pertov mail 1");
        phonebook.add("ivanov","ivanov phone 2", "ivanov mail 2");

        System.out.println("email Ivanov: "+phonebook.getMails("ivanov"));
        System.out.println("email pertov: "+phonebook.getMails("pertov"));

        System.out.println("email Ivanov: "+phonebook.getPhones("ivanov"));
        System.out.println("email pertov: "+phonebook.getPhones("pertov"));


    }

}
