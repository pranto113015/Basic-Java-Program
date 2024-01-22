package leapyearcheck;

import java.util.*;

public class Leapyearcheck {

    public static void main(String[] args) {
        int year;
        Scanner ob = new Scanner(System.in);
        year = ob.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }

    }

}
