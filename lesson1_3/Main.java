package lesson1_3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {

        otg();


    }

    static void otg (){
        String cont ="хмм";
        String [] words = {"лимон", "яблоко", "яйцо"};
        int secret = 1;
        System.out.println(words[secret]);


        while (true) {
            System.out.println("\nУгадайте слово?");
            String answer = sc.nextLine();
            if (answer.equals(words[secret])){
                System.out.println("Вы угадали слово");
                break;
            } else {

                for (int i = 0; i < 15; i++) {
                    if (i < words[secret].length() && i < answer.length() && words[secret].charAt(i) == answer.charAt(i)) {
                        System.out.print(words[secret].charAt(i));
                    } else {
                        System.out.print("#");
                    }

                }
            }
        }
        System.out.println("Вы угадали слово — "+words[secret]);
    }
}
