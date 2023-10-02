package Array;

public class ResizingAnArray {

    public static int[] resizeArr(int[] arr) {
        int capacity = arr.length * 2;
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 0 };
        System.out.println(resizeArr(arr).length);
    }

}
