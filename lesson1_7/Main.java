package lesson1_7;

public class Main {
    public static void main(String[] args) {

        Plate plate1 = new Plate(100);

        Cat [] cats = new Cat[3];
        cats[0] = new Cat("Vasya",12);
        cats[1] = new Cat("Phil",20);
        cats[2] = new Cat("Hueston",30);
        plate1.getFood();

        for (Cat array:cats
             ) {
            array.eat(plate1,array.getSatietyCount());
        }

        cats[0].info();
        cats[1].info();
        cats[2].info();
        plate1.getFood();
        plate1.increaseFood(100);
        plate1.getFood();
    }
}
