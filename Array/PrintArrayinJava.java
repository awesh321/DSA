package Array;

//this class is to show how array is print 
public class PrintArrayinJava {

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        PrintArrayinJava printArrayinJava = new PrintArrayinJava();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        printArrayinJava.printArr(arr);

    }
}
