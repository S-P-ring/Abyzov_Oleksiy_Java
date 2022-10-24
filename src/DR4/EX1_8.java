package DR4;

import java.util.Scanner;

public class EX1_8 {
    public static void main(String[] args) {
        System.out.println("Введіть числа через пробіл:");
        Scanner scanner = new Scanner(System.in);
        for (String number : scanner.nextLine().split(" ")) {
            if (check(number)) System.out.println(number);
        }
    }

    private static boolean check(String numbers) {
        int prev = Integer.MIN_VALUE;
        for (char ch : numbers.toCharArray()) {
            if (prev > ch) return false;
            prev = ch;
        }
        return true;
    }
}
