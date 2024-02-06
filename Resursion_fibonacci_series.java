package resursion_fibonacci_series;

import java.util.Scanner;

public class Resursion_fibonacci_series {

    public static int fibo(int num) {
        if ((num == 0) || (num == 1)) {
            return num;
        }
        return fibo(num - 1) + fibo(num - 2);
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("How Many Numbers you want :");
        int num = ob.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

}
