package interfaceexample;

interface A {

    int b = 5;

    public void display();
}

public class Interfaceexample implements A {

    public void display() {
        System.out.println("HI");
    }

    public static void main(String[] args) {
        Interfaceexample ob = new Interfaceexample();
        System.out.println(ob.b);
        ob.display();

    }

}
