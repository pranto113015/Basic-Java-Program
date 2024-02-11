package multilevel_inheritance;

class Animal {

    void eat() {
        System.out.println("I can eat");
    }
}

class Mammal extends Animal {

    void walk() {
        System.out.println("I can walk");
    }
}

public class Multilevel_inheritance extends Mammal {

    void talk() {
        System.out.println("I can talk");
    }

    public static void main(String[] args) {
        Multilevel_inheritance ob = new Multilevel_inheritance();
        ob.eat();
        ob.walk();
        ob.talk();
    }
}
