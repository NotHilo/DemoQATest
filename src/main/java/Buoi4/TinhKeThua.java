package Buoi4;

public class TinhKeThua extends PhamViTruyCap {

    public static void main(String[] args) {

        TinhKeThua kThua = new TinhKeThua();

        kThua.msgSuccess();
        kThua.msgError();
        System.out.print(kThua.cong2so(2, 3));
    }
}