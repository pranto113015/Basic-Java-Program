package hierarchical_inheritance;

class Dad {

    void nose() {
        System.out.println("My Nose is Big in size!");
    }
}

class Son extends Dad {

    void height() {
        System.out.println("I'm taller as my mom");
    }
}

class Daughter extends Dad {

    void talkative() {
        System.out.println("I'm talkative as my Grand-mom");
    }
}

public class Hierarchical_inheritance {

    public static void main(String[] args) {
        Son ob = new Son();
        ob.nose();
        ob.height();

        Daughter ob1 = new Daughter();
        ob1.talkative();
    }

}
