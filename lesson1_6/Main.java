package lesson1_6;

import lesson1_6.animals.Cat;
import lesson1_6.animals.Dog;

public class Main {
    public static void main(String[] args) {

        Cat[] catsArray=new Cat[2];
        catsArray[0]=new Cat("Barsik",200, 250);
        catsArray[1]=new Cat("Phil",300, 300, 100);


        Dog dog1 = new Dog("Capito",500, 350, 300);
        Dog dog2 = new Dog("Kus",600, 450, 400);

        for (Cat a: catsArray) {

            a.running(250);
            a.jumping(270);
            a.swimming(50);
        }

    }
}
