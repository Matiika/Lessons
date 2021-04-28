package lesson1_6.animals;

public class Animals {
    protected String name;
    protected String type;

    protected int runningLength;
    protected int jumpingLenght;
    protected int swimmingLenght;

    public Animals(String name, String type, int runningLength, int jumpingLenght, int swimmingLenght) {
        this.name = name;
        this.type = type;
        this.runningLength = runningLength;
        this.jumpingLenght = jumpingLenght;
        this.swimmingLenght = swimmingLenght;
    }



    public void running (int letRunningLenght){
        if (runningLength>=letRunningLenght){
            System.out.println(type+" "+name+" сможет пробежать");
        } else {
            System.out.println(type+" "+name+" не может пробежать");
        }
    }

    public void swimming (int letLenght){
        if (swimmingLenght>=letLenght){
            System.out.println(type+" "+name+" сможет проплыть");
        } else {
            System.out.println(type+" "+name+" не может проплыть");
        }
    }

    public void jumping (int letHight){
        if (jumpingLenght>=letHight){
            System.out.println(type+" "+name+" сможет перепгрынуть");
        } else {
            System.out.println(type+" "+name+" не может перепгрынуть");
        }
    }

    public void info(){
        System.out.print("Имя: "+name+"| Событие: ");
    }



}


