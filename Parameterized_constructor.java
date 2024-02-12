package parameterized_constructor;

public class Parameterized_constructor {

    Parameterized_constructor(String name) {
        System.out.println("I'm " + name);
    }

    public static void main(String[] args) {
        Parameterized_constructor ob = new Parameterized_constructor("Pranto");
    }

}
