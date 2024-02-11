package single_inheritance;

class father {

    void display() {
        System.out.println("I am your Dad");
    }
}

public class Single_inheritance extends father {

    public static void main(String[] args) {
        Single_inheritance ob = new Single_inheritance();
        ob.display();
    }

}
