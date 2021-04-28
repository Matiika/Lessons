package lesson1_5;

public class Workers {
    private String fio;
    private String position;
    private int phoneNumber;
    private String mail;
    private int salary;
    private int age;

    public Workers(String fio, String position, int phoneNumber, String mail, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println("ФИО: "+fio+"| Номер телефона: "+phoneNumber+"| Возраст: "+age+"| Зарплата: "+salary);
    }

    public int getAge() {
        return age;
    }
}
