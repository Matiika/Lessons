package lesson1_7;

public class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount){
            food-=amount;
    }

    public void increaseFood(int amount){
        food+=amount;
    }

    public void getFood() {
        System.out.println ("Количество еды в тарелке: "+food);
    }
}
