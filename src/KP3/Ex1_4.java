package KP3;


class TestFloat {
    float f;
}

public class Ex1_4 {
    public static void main(String[] args){
        TestFloat tf1 = new TestFloat();
        TestFloat tf2 = new TestFloat();
        tf1.f = 2.3f;
        tf2.f = 2.6f;
        System.out.println("1: tf1.f = " + tf1.f + ", tf2.f = " + tf2.f);
        tf1 = tf2;
        System.out.println("2: tf1.f = " + tf1.f + ", tf2.f = " + tf2.f);
        tf1.f = 2.8f;
        System.out.println("3: tf1.f = " + tf1.f + ", tf2.f = " + tf2.f);
    }
}
