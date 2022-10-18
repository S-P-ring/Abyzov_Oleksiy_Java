package KP3;


public class Ex1_6 {
    public static void main(String[] args){
        Dog dog1 = new Dog("spot", "Ruff!");
        Dog dog2 = new Dog("scruffy", "Wurf!");
        dog1.display_info();
        dog2.display_info();
    }
}

class Dog {
    String name;
    String say;
    Dog(String name, String say)
    {
        this.name = name;
        this.say = say;
    }

    void display_info() {
        System.out.printf("Name: %s \tSay: %s\n", name, say);
    }
}
