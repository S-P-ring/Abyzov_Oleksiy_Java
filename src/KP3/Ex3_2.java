package KP3;

import java.util.Random;
import java.util.Arrays;

public class Ex3_2 {

    public static void main(String[] args) {
        int n = 100;
        int[] array = new int[25];
        for (int i = 0; i < 25; i++) {
            int x = new Random().nextInt(n);
            Arrays.sort(array);
            int res = Arrays.binarySearch(array, x);
            if (x == array[array.length-1]) {
                System.out.printf("На данний момент це найбільше число: %d\n", x);
            } else if (res > 0) {
                System.out.printf("%d На данний момент це число повторюється\n", x);
            } else if (x == array[0]) {
                System.out.printf("На данний момент це найменше число: %d\n", x);
            } else {
                System.out.println(x);
            }
            array[i] = x;
        }
    }

}