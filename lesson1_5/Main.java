package lesson1_5;

public class Main {
    public static void main(String[] args) {
        Workers[] workersArray=new Workers[5];
        workersArray[0] = new Workers("Matvei","Engineer",23423432,"asd@sad",1000,41);
        workersArray[1] = new Workers("Dima","Engineer",4654567,"asd@sad",1000,30);
        workersArray[2] = new Workers("Egor","Engineer",54623423,"asd@sad",1000,45);
        workersArray[3] = new Workers("Artem","Engineer",78945654,"asd@sad",1000,30);
        workersArray[4] = new Workers("Phil","Engineer",98546543,"asd@sad",1000,40);

        for (Workers c: workersArray
             ) {
            c.info();
        }

        System.out.println("Люди старше 40");

        for (Workers c: workersArray
        ) {
            int a = c.getAge();
            if (a>=40){
                c.info();
            }
        }



    }
}
