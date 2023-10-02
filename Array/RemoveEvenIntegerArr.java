package Array;

//this class is to show how to remove even integers in array
public class RemoveEvenIntegerArr {

    public void rmvEvenInt(int[] arr) { // this one is my method which i come up with
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                continue;
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        // this one is not what we are suppose to do as it will just print the even
        // array but the length of array is going to be same
    }

    public int[] removeArr(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        int[] result = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
        // first we are going to count the number of odd integer and then we create a
        // new array with the length of odd integer and create an array

    }

    public static void main(String[] args) {
        RemoveEvenIntegerArr removeEvenIntegerArr = new RemoveEvenIntegerArr();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 12, 14, 16 };
        removeEvenIntegerArr.removeArr(arr);
        System.out.println(removeEvenIntegerArr.removeArr(arr).length);

    }

}
