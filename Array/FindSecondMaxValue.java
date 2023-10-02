package Array;

public class FindSecondMaxValue {

    public static int scndMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }
        return secMax;

    }

    public static void main(String[] args) {
        int[] abr = { 1, 2, 8, 4, 5, 6, 7 };
        System.out.println(scndMax(abr));
    }

}
