package Buoi1;

public class TestStaticVsInstance {
    int x = 5;                // biến instance
    static int y = 10;        // biến static

    public static void main(String[] args) {
        TestStaticVsInstance a1 = new TestStaticVsInstance();
        TestStaticVsInstance a2 = new TestStaticVsInstance();

        System.out.println("Ban đầu:");
        System.out.println("a1.x = " + a1.x + ", a1.y = " + a1.y);
        System.out.println("a2.x = " + a2.x + ", a2.y = " + a2.y);

        a1.x = 20;     // thay đổi biến instance của a1
        a1.y = 30;     // thay đổi biến static (chung cho cả class)

        System.out.println("\nSau khi thay đổi a1:");
        System.out.println("a1.x = " + a1.x + ", a1.y = " + a1.y);
        System.out.println("a2.x = " + a2.x + ", a2.y = " + a2.y);
    }
}
