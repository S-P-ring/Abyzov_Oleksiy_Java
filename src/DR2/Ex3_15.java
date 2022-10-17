package DR2;

import java.util.Scanner;

public class Ex3_15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[9];
        System.out.println("Введіть позиції: ");
        for (int e = 0; e < array.length; e++) {
            array[e] = scanner.nextLine();
        }
        for (int i = 1; i < array.length + 1; i++) {
            if (i%3 == 0) {
                System.out.println(array[i - 1]);
            }else {
                System.out.print(array[i-1] + "|");
            }
        }
    }
}
