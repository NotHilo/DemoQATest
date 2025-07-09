package Buoi4;

class A_Private {
    private int data = 40;

    private void msg() {
        System.out.println(data);
    }
}

public class PhamViTruyCap {

    protected void msg() {
        System.out.println("This is msg function at PhamViTruyCap.");
    }

    public void msgSuccess() {
        System.out.println("This is msgSuccess function at PhamViTruyCap.");
    }

    public void msgError() {
        System.out.println("This is msgError function at PhamViTruyCap.");
    }

    public int cong2so(int a, int b) {
        return a + b;
    }
}
