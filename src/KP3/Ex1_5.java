package KP3;

class TestMethod {
    float f;
}

public class Ex1_5 {
    public static void changeValue(TestMethod tm) {
        tm.f = 2.1f;

    }
    public static void main(String[] args){
        TestMethod m = new TestMethod();
        m.f = 1.7f;
        System.out.println("1: m.f: " + m.f);
        changeValue(m);
        System.out.println("2: m.f: " + m.f);
    }
}
