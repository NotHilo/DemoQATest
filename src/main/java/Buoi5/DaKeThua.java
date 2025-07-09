package Buoi5;

import Buoi4.TinhKeThua;

public class DaKeThua extends TinhKeThua {

    public static void main(String[] args) {

        DaKeThua dkt = new DaKeThua();

        dkt.msg();
        dkt.msgSuccess();
        dkt.msgError();
        System.out.println(dkt.cong2so(1, 2));
    }
}

