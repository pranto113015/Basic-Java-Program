package switch1;

import java.util.*;

public class Switch1 {

    public static void main(String[] args) {
        int a;
        Scanner ob = new Scanner(System.in);
        a = ob.nextInt();
        switch (a) {
            case 3 -> System.out.println("Monday");
            case 4 -> System.out.println("Tuesday");
            case 5 -> System.out.println("Wednesday");
            case 6 -> System.out.println("Thursday");
            case 7 -> System.out.println("Friday");
            case 1 -> System.out.println("Saturday");
            case 2 -> System.out.println("Sunday");

            default -> System.out.println("Invalid Number");
        }
    }
}
