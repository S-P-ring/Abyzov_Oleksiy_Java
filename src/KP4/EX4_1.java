package KP4;

public class EX4_1 {
    public static void main(String[] args) {
        int p = 1;
        int q = 33;
        int e = p/q;
        if (p / q == 0) {
            p *= 10;
        }
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            if (p / q == 0) {
                p *= 10;
            } else {
                array[i] = p/q;
                p = (p%q)*10;
            }
            System.out.println(array[i]);
        }
        int c = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = i  + 1; j < array.length; j++){
                if (array[i] != array[j]){
                    continue;
                }
                else if (array[i] == array[j]){
                    c += 1;
                }

            }
        }

    }
}