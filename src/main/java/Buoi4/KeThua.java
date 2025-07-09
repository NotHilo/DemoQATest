package Buoi4;

public class KeThua extends Staff {

    String position;
    double salary;

    KeThua(String name, int age, String DOB, char gender, String position, double salary) {
        super(name, age, DOB, gender);
        this.position = position;
        this.salary = salary;
    }

    public static void main (String[] args) {

        KeThua kte = new KeThua("Vu", 18, "01/01/2007", 'M', "Director", 4999.99);
        kte.printInfo();
        System.out.println("Position: " + kte.position);
        System.out.println("Salary: " + kte.salary);

        System.out.println("****************");

        System.out.println(Cong(5,10));
        System.out.println(Nhan(6, 9));
    }

}
