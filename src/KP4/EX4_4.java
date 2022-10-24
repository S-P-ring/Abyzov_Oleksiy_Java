package KP4;

import java.util.Scanner;

public class EX4_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число n:");
        int n = scanner.nextInt();
        for (int i = 10; i < 100; i++){
            if (i%n == 0 & i != 10){
                System.out.print("\n");
                System.out.print(i + "  ");
            }
            else {
                System.out.print(i + "  ");
            }
        }
    }
}
