package lesson1_7;

public class Cat {
    private String name;
    private boolean satiety;
    private int satietyCount;

    public Cat(String name, int satietyCount) {
        this.name = name;
        this.satiety = false;
        this.satietyCount = satietyCount;
    }

    public int getSatietyCount() {
        return satietyCount;
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate plate,int amountFood) {
        if (amountFood > plate.food) {
            System.out.println("В тарелке недостаточно еды");
        } else {
            plate.decreaseFood(amountFood);
            satiety=true;
        }
    }

    public void info()
    {
        if (satiety){
            System.out.println(name+" сытый");
        } else {
            System.out.println(name+" голодный");
        }
    }


}
