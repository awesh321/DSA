package Array;

public class FindMissingNum {
    // we need to find the missing num in array
    // Mathematical approach:- adding all the numeber in respective arrays and
    // deleting with the missing array will let you know the number
    // to find the sum of n numbers there is num formula n(n+1)/2

    public static int missingNum(int[] arr) {
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a = a + arr[i];
        }
        int miss = total - a;
        return miss;

    }

    public static void main(String[] args) {
        int[] abr = { 1, 2, 3, 4, 5, 7 };
        System.out.println(missingNum(abr));

    }
}
