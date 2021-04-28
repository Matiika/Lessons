package lesson1_4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int SIZE = 4;
    static final int DOTS_TO_WIN = 4;

    static char DOT_X='X';
    static char DOT_O='O';
    static char DOT_EMPTY='.';

    static char[][] map;

    static Scanner sc = new Scanner (System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("Вы победили");
                break;
            }


            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            if (checkAIWin()==false) {
                if (checkPlayerWin() == false) {
                    aiTurn();
                }
            }
            printMap();

            if (checkWin(DOT_O)){
                System.out.println("Компьютер победил");
                break;
            }

            if (isFull()){
                System.out.println("Ничья");
                break;
            }
        }
    }

    static void initMap(){
        map=new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <SIZE; j++) {
                map[i][j]=DOT_EMPTY;
            }

        }
    }

    static void printMap(){
        System.out.print("  ");
        for (int i = 1; i <= SIZE ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i+1+" ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void humanTurn(){
        int x,y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt()-1;
            y = sc.nextInt()-1;
        }while (!isCellValid(y,x));
        map[y][x]=DOT_X;
    }

    static boolean isCellValid(int y, int x){
        if(x<0 || y<0 || x>=SIZE || y>=SIZE) {
            return false;
        }
        return map [y][x]==DOT_EMPTY;
    }

    static void aiTurn(){
        int x,y;

            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            } while (!isCellValid(y, x));
            map[y][x] = DOT_O;

    }

    static boolean checkPlayerWin(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j]==DOT_EMPTY) {
                    map[i][j]=DOT_X;
                    if (checkWin(DOT_X)) {
                        map[i][j] = DOT_O;
                        return true;
                    } else {
                        map[i][j] = DOT_EMPTY;
                    }
                }
            }
        }
        return false;
    }

    static boolean checkAIWin(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j]==DOT_EMPTY) {
                    map[i][j]=DOT_O;
                    if (checkWin(DOT_O)) {
                        return true;
                    } else {
                        map[i][j] = DOT_EMPTY;
                    }
                }
            }
        }
        return false;
    }

    static boolean isFull (){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j]==DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkWin(char c){

        int count = 0;

        for (int i = 0; i < SIZE-1; i++) {
            for (int j = 0; j < SIZE - 1; j++) {
                if(map[i][j]==c && map[i+1][j]==c){
                    count=count+1;
                }

                System.out.println("Число: "+count);


                if(count==DOTS_TO_WIN){
                    return true;
                }


                if(i==SIZE-1||j==SIZE-1){
                    count=0;
                }




            }
        }

//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE-2; j++) {
//
//
//                    if(map[j][i]==c && map[j+1][i]==c && map[j+2][i]==c){
//                    return true;
//                }
//
//                if(map[i][j]==c && map[i][j+1]==c && map[i][j+2]==c){
//                    return true;
//                }
//
//                if (map[j][j]==c && map[j+1][j+1]==c && map[j+2][j+2]==c){
//                    return true;
//                }
//
//                if (map[j+2][j]==c && map[j+1][j+1]==c && map[j][j+2]==c){
//                    return true;
//                }
//            }
//        }


//        if(map[0][0]==c && map[0][1]==c && map[0][2]==c) return  true;
//        if(map[1][0]==c && map[1][1]==c && map[1][2]==c) return  true;
//        if(map[2][0]==c && map[2][1]==c && map[2][2]==c) return  true;
//
//        if(map[0][0]==c && map[1][0]==c && map[2][0]==c) return  true;
//        if(map[0][1]==c && map[1][1]==c && map[2][1]==c) return  true;
//        if(map[0][2]==c && map[1][2]==c && map[2][2]==c) return  true;
//
//        if(map[0][0]==c && map[1][1]==c && map[2][2]==c) return  true;
//        if(map[0][2]==c && map[1][1]==c && map[2][0]==c) return  true;

        return false;
    }

}
