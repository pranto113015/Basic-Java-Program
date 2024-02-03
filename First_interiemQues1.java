/*
Write a Java program to input electricity unit charge and calculate the total 
electricity bill according to the given condition:

For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill.
 */
package first_interiemques1;

import java.util.Scanner;

public class First_interiemQues1 {

    public static void main(String[] args) {
        float unit;
        float amt, total_amt, sur_charge;

        Scanner ob = new Scanner(System.in);
        unit = ob.nextInt();

        if (unit <= 50) {
            amt = (float) (unit * 0.50);
        } 
        else if (unit <= 150) {
            amt = (float) (25 + ((unit - 50) * 0.75));
        } 
        else if (unit <= 250) {
            amt = (float) (100 + ((unit - 150) * 1.20));
        } 
        else {
            amt = (float) (220 + ((unit - 250) * 1.50));
        }

        sur_charge = (float) (amt * 0.20);
        total_amt = amt + sur_charge;

        System.out.println(total_amt);
    }

}
