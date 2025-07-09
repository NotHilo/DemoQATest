package Buoi2;

class Buoi2 {

    public String name = "Tai";
    public String hometown = "VL";

    public void getInfo(){
        System.out.println("Ten cua ban: " + name);
        System.out.println("Que cua ban: " + hometown);
    }
    public static void main(String[] args) {

        String job = "Tester";
        Buoi2 buoi2 = new Buoi2();

        buoi2.getInfo();
        MethodNe.getAge();
        System.out.println("Nghe cua ban: " + job);
    }

}
