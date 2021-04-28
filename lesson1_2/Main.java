package lesson1_2;

public class Main {
    public static void main(String[] args) {

        int[] array= {1,0,1,0,1,1,0,0};
        zeroone(array);
        printarray(array);

        int[] array2=new int[8];
        int schet = 0;
        for (int i = 0; i < array2.length; i++) {
            array2[i]=schet;
            schet=schet+3;
        }
        printarray(array2);

        int[] array3={1,12,6,7,1,2,3,4,5,6};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i]<6){
                array3[i]=array3[i]*2;
            }
        }
        printarray(array3);

        int [][] array4=new int[3][3];
        for (int i = 0; i <array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                if (i==j){
                    array4[i][j]=1;
                }
            }

        }
        printarray2(array4);

        int[] array5={1,1,1,2,6};

        int min=array5[1];
        int max=array5[1];
        for (int i = 0; i <array5.length; i++) {
            if (min>array5[i]){
                min=array5[i];
            }
            if (max<array5[i]) {
                max=array5[i];
            }
        }
        System.out.println("Максимальное: "+max+"|Минимальное: "+min);

        System.out.println(sum(array5));

        int[] array6={1,2,3,4,5};

        smech(array6);

        int[] array7={1,2,3,4,5};



    }


    static int [] zeroone(int [] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==1) {
                array[i]=0;
            } else {
                array[i]=1;
            }
        }
        return array;
    }



    static void printarray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    static void printarray2(int [][] array){
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    static boolean sum (int [] array){
        int sumLeft=0;
        int sumRight=0;
        int count=0;
        for (int i = 1; i < array.length; i++) {
            count=i;
            for (int j = 0; j < i; j++) {
                sumLeft=sumLeft+array[j];
            }
            for (int j = i; j <array.length; j++) {
                sumRight=sumRight+array[j];
            }

            if (sumLeft==sumRight){
                System.out.println("Сумма левой половины = "+sumLeft);
                System.out.println("Сумма правой половины = "+sumRight);
                return true;
            }


            sumLeft=0;
            sumRight=0;

        }
        return false;
    }

    static void smech(int [] array){
        int k=1;
        for (int i = 0; i < k; i++) {
            int tmp = array[0];
            for (int j = 0; j < array.length - 1; j++){
                array[j] = array[j+1];}
            array[array.length - 1] = tmp;
        }

        printarray(array);


        for (int i = 0; i < k; i++) {
            int tmp = array[array.length-1];
            for (int j = array.length; j > 1; j--){
                array[j-1] = array[j-2];}
            array[0] = tmp;
        }

        printarray(array);

    }

}
