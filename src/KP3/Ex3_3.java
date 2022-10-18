package KP3;

import java.util.Arrays;
import java.util.Random;

public class Ex3_3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < 1; i++) {
            int x = new Random().nextInt(n);
            x += 1;
            System.out.println(x);
        }
    }
}
