package noparameter_returntype;

public class NoParameter_returntype {

    int add() //Function Prototype
    {
        int a = 10, b = 5, s;
        s = a + b;
        return s;
    }

    public static void main(String[] args) {

        NoParameter_returntype ob = new NoParameter_returntype();
        System.out.println(ob.add()); //inline function
//        int result=ob.add();
//        System.out.println(result);
    }

}
