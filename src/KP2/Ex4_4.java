package KP2;

public class Ex4_4 {
    public static double perimetr(double a, double b, double c){
        double p = a + b + c;
        return p;
    }

    public static double plosha(double a, double b, double c){
        double p_2 = perimetr(a, b, c)/2;
        double s = Math.sqrt(p_2*(p_2 - a)*(p_2 - b)*(p_2 - c));
        return s;
    }

    public static void main(String[] args){
        double a = 3;
        double b, c;
        b = c = 3.5 + 3*Math.pow(2, -111);
        System.out.println(perimetr(a, b, c));
        System.out.println(plosha(a, b, c));
    }
}
