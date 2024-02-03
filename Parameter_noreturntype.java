package parameter_noreturntype;

public class Parameter_noreturntype {

    void add(int a, int b) //Function Prototype
    {
        int s;
        s = a + b;
        System.out.println("Summation= " + s);
    }

    public static void main(String[] args) {
        Parameter_noreturntype ob = new Parameter_noreturntype();
        ob.add(10, 15); //calling function
    }

}
