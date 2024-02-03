package noparameter_noreturntype;

public class Noparameter_noreturntype {

    void add() {
        int a = 10, b = 20, s;
        s = a + b;
        System.out.println("Summation= " + s);
    }

    public static void main(String[] args) {
        Noparameter_noreturntype ob = new Noparameter_noreturntype();
        ob.add();
    }

}
