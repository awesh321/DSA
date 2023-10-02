package Array;

public class ReverseArray {

    public static void revArr(int[] arr) {
        int start = 0;
        int last = arr.length - 1;
        while (start < last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] abr = { 1, 2, 3, 4, 5, 6, 7 };
        revArr(abr);
        printArr(abr);
    }
}
