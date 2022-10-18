package KP3;

public class Ex2_3 {
    public static void main(String[] args){
        char a = 'a';
        char b = 'b';
        func(a);
        func(b);
    }

    static void func(char x){
        System.out.println(Integer.toBinaryString(x));
    }

}
