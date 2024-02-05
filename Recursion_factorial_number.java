package recursion_factorial_number;

public class Recursion_factorial_number {

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 4 is: " + factorial(4));
    }

}
