package super_keyword;

class Boss {

    String name = "Zayed Khan";

    void mission() {
        System.out.println("Boss has inititiated Mission");
    }
}

public class Super_keyword extends Boss {

    void execute() {
        System.out.println("Boss Name: " + super.name);
        super.mission();
        System.out.println("Okay I'll execute Boss's mission");
    }

    public static void main(String[] args) {
        Super_keyword ob = new Super_keyword();
        ob.execute();
    }

}
