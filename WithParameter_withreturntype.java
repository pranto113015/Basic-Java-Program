package withparameter_withreturntype;

public class WithParameter_withreturntype {

    int add(int a, int b) //Function Prototype
    {
        int s;
        s = a + b;
        return s;
    }

    public static void main(String[] args) {
        WithParameter_withreturntype ob = new WithParameter_withreturntype();
        System.out.println(ob.add(10,5)); //inline function
//        int result = ob.add(10, 5);
//        System.out.println(result);
    }

}
