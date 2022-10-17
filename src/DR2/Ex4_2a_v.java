package DR2;

import java.util.Scanner;

public class Ex4_2a_v {
    public static double function1(double x, double y){
        double a = Math.pow(x, 3) + 3*Math.pow(x,2)*y + 3*x*Math.pow(y, 2) + Math.pow(y, 3);
        return a;
    }

    public static double function2(double x, double y){
        double v = x + y + Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(x, 4) + Math.pow(y, 4);
        return v;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("x: ");
        double x = scanner.nextDouble();
        System.out.println("y: ");
        double y = scanner.nextDouble();
        System.out.println(function1(x, y));
        System.out.println(function2(x, y));
    }
}
