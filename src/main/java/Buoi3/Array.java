package Buoi3;

public class Array{

    public static void main (String[] args) {

        String[] foods = new String[4];
        foods[0] = "Com";
        foods[1] = "Mi";
        foods[2] = "Hu Tiu";
        foods[3] = "Pho";

        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i] + " khô");
        }
    }
}
