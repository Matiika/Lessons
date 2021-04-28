package lesson1;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double a,b,c,d;
        a=2;
        b=3;
        c=4;
        d=5;
        System.out.println(count(a,b,c,d));
        System.out.println(truefalse(10,3));
        polotr(-0.1);
        hi("Хьюстон");
    }

    static double count (double a, double b, double c, double d){
        return (a*(b+(c/d)));
    }

    static boolean truefalse(double a, double b){
        if ((a+b)>=10 && (a+b)<=20){
            return true;
        } else {
            return false;
        }
    }

    static void polotr(double a){
        if (a>=0){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    static void hi(String a){
        System.out.println("Привет, "+a);
    }


}
