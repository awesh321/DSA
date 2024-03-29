package StackAndQueue.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenratingBinaryUsingQueue {
    public String[] gentraingB(int n) {
        String[] result = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");
        for (int i = 0; i < n; i++) {
            result[i] = q.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            q.offer(n1);
            q.offer(n2);

        }
        return result;
    }

    public void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        GenratingBinaryUsingQueue genratingBinaryUsingQueue = new GenratingBinaryUsingQueue();
        String[] a = genratingBinaryUsingQueue.gentraingB(5);
        genratingBinaryUsingQueue.printArr(a);

    }
}
