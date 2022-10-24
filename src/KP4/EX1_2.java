package KP4;

import java.util.Scanner;

public class EX1_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть числа через пробіл:");
        String str = scanner.nextLine();
        String[] strs = str.split(" ");
        for (int i = 0; i < strs.length; i++){
            System.out.println(strs[i]);
        }
    }
}
