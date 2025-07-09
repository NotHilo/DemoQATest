package Buoi3;

public class Array2 {

    public static void InputData(int array[], int value){

        // mỗi lần lặp, lấy số của dãy trước và cộng thêm 5

        for (int i = 0; i < array.length; i++) {
            array[i] += value;
            if (i > 0){
                array[i] = array[i-1] + value;
            }
        }
    }

    public static void OutputData(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args){

        int mang[] = new int[20];
        InputData(mang, 5);
        OutputData(mang);
    }
}
