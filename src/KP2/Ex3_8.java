package KP2;

import java.util.Scanner;

public class Ex3_8 {
    public static int cila_chastina(double var){
        return (int) var;
    }

    public static double drobova_chastina(double var){
        return var - cila_chastina(var);
    }

    public static int naymenshe(double var){
            return cila_chastina(var) + 1;
    }

    public static int naybilshe(double var) {
            return cila_chastina(var) - 1;
    }

    /*тут реалізується не математичне округлення*/
    public static int okruglenay(double var) {
        if (var > 0) {
            if (drobova_chastina(var) >= 0.5) {
                return naymenshe(var);
            } else {
                return naybilshe(var) + 1;
            }
        }
        else {
            if (drobova_chastina(var) <= -0.5) {
                return naybilshe(var);
            } else {
                return naymenshe(var) - 1;
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть дійсне число:");
        double var = scanner.nextDouble();
        System.out.println(cila_chastina(var));
        System.out.println(drobova_chastina(var));
        System.out.println(naymenshe(var));
        System.out.println(naybilshe(var));
        System.out.println(okruglenay(var));
    }
}
