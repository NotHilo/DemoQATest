package Buoi4;

public class Staff {

    String name;
    int age;
    String DOB;
    char gender;

     public Staff(String name, int age, String DOB, char gender) {
         this.name = name;
         this.age = age;
         this.DOB = DOB;
         this.gender = gender;
     }

     void printInfo(){
         System.out.println("Staff Name: " + name);
         System.out.println("Age: " + age);
         System.out.println("Your DOB is(DD/MM/YYYY): " + DOB);
         System.out.println("Gender (M/F): " + gender);
     }

     protected static int Cong(int a, int b){
         return a+b;
     }

     public static int Nhan(int a, int b){
         return a*b;
     }

     public static void main(String[] args) {
         Staff staff1 = new Staff("Dung", 24, "22/11/2001", 'F');
         staff1.printInfo();
         System.out.println("a + b = " + Cong(2, 4));
         System.out.println("a * b = " + Nhan(2, 4));
     }

}
