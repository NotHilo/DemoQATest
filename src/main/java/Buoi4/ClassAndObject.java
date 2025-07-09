package Buoi4;

class TestClass{

    int number1 = 10;
    int number2 = 20;
    int sum;

    public int Cong(int a, int b){
        return sum = a+b;
    }
}

public class ClassAndObject {

    public static void main(String[] args) {

        TestClass testClass = new TestClass();

        testClass.Cong(testClass.number1, testClass.number2);
        System.out.println(testClass.sum);
    }
}
