package lesson1_6.animals;

public class Cat extends Animals {

    public Cat(String name, int runningLength, int jumpingLenght) {
        super(name, "Кот", runningLength, jumpingLenght, 0);
    }

    public Cat(String name, int runningLength, int jumpingLenght, int swimmingLenght) {

        super(name, "Кот", runningLength, jumpingLenght, swimmingLenght);
    }
}