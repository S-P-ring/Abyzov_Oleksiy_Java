package KP4;

import java.util.Scanner;

public class EX4_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число n:");
        int n = scanner.nextInt();
        for (int i = 1; i < 1001; i++){
            if ((i-1)%n == 0 & i != 1){
                if (i < 10){
                    System.out.print("\n");
                    System.out.print("   " + i + "  ");
                }
                else if (i < 100){
                    System.out.print("\n");
                    System.out.print("  " + i + "  ");
                }
                else{
                    System.out.print("\n");
                    System.out.print(" " + i + "  ");
                }
            }
            else {
                if (i<10){
                    System.out.print("   " + i + "  ");
                }
                else if (i <100){
                    System.out.print("  " + i + "  ");
                }
                else {
                    System.out.print(" " + i + "  ");
                }
            }
        }
    }
}
