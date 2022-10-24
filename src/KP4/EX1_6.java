package KP4;

import java.util.Arrays;
import java.util.Scanner;

public class EX1_6 {
    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть числа масива через пробіл:");
        String str = scanner.nextLine();
        String[] strs = str.split(" ");
        Arrays.sort(strs);
        System.out.println(strs[0]);
        for (int i = 0; i < strs.length-1; i++) {
            if (strs[i].length() == strs[i+1].length()) {
                System.out.println(strs[i+1]);
            }
        }
    }
}