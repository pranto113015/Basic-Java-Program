package super_key_ex2;

class Boss {

    void mission() {
        System.out.println("Boss has inititiated Mission");
    }
}

class Sub_Boss extends Boss {

    void deal() {
        super.mission();
        System.out.println("Deal is being closed by boss");
    }
}

public class Super_key_ex2 extends Sub_Boss {

    void execute() {
        super.deal();
        System.out.println("Okay I'll execute Boss's Call");
    }

    public static void main(String[] args) {
        Super_key_ex2 ob = new Super_key_ex2();
        ob.execute();
    }

}
