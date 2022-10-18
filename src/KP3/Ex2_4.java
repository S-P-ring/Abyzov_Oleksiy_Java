package KP3;

import java.util.Scanner;

public class Ex2_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть n:");
        int n = scanner.nextInt();
        System.out.println("Введіть m:");
        int m = scanner.nextInt();
        System.out.println(func(m, n));
    }
    static int func(int m, int n) {
        return n ^ 1 << m;
    }
}
