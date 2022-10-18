package KP3;

import java.util.Scanner;

public class Ex3_4 {
    public static void main(String[] array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввдеіть а:");
        int a = scanner.nextInt();
        System.out.println("Ввдеіть б:");
        int b = scanner.nextInt();
        System.out.println("Ввдеіть в:");
        int c = scanner.nextInt();
        if (a == b & b == c){
            System.out.println("3");
        }
        else if (a == b | a == c | b == c){
            System.out.println("2");
        }
        else{
            System.out.println("1");
        }
    }
}
