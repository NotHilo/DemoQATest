package Buoi4;

public class Lobster extends Shrimp {

    double price;
    String species;

    public Lobster(double age, double weight, int legNum, double price, String species){
        super(age, weight, legNum);
        this.price = price;
        this.species = species;

    }

    public static void main(String[] args){

        Lobster lobster1 = new Lobster(10,4,12,1000, "Tôm Hùm Bông");
        Lobster lobster2 = new Lobster(100,20,16,5000, "Tôm Hoàng Đế");

        lobster1.getInfo();
        System.out.println("This species is called " + lobster1.species);
        System.out.println("Price is: " + lobster1.price);
        System.out.println("*******************");
        lobster2.getInfo();
        System.out.println("This species is called " + lobster2.species);
        System.out.println("Price is: " + lobster2.price);
    }

}


