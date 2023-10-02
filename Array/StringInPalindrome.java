package Array;

public class StringInPalindrome {

    public static boolean findPal(String a) {
        char[] charArray = a.toCharArray();
        int start = 0;
        int last = charArray.length - 1;
        while (start < last) {
            if (charArray[start] != charArray[last]) {
                return false;
            }
            start++;
            last--;
        }
        return true;

    }

    public static void main(String[] args) {
        String a = "abbbba";
        System.out.println(findPal(a));

    }

}
