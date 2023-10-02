package Array;

//finding minimum value in array
public class MinValueArray {

    public static int minVal(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int minvalue(int[] arr) {
        int max = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        return max;
    }
    // we decide that first value is min value and then we start a loop with rest of
    // array and see who is less than that vale and change that value with min one

    public static void main(String[] args) {
        int[] arr = { 12, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(minVal(arr));
        System.out.println(minvalue(arr));

    }

}
