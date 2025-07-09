package Buoi4;

public class Shrimp {

    double age;
    double weight;
    int legNum;

    public Shrimp(double age, double weight, int legNum){
        this.age = age;
        this.weight = weight;
        this.legNum = legNum;
    }

    public void getInfo(){
        System.out.println("Shrimp's age is: " + age);
        System.out.println("Shrimp's weight is: " + weight);
        System.out.println("Shrimp's leg number is: " + legNum);
    }
}



