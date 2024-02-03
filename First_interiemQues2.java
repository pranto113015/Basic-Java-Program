package first_interiemques2;

public class First_interiemQues2 {

    public static void main(String[] args) {

        int[] a = {12, 34, 1, 8, 9};

        int max_element = a[0], min_element = a[0]; //Initializing with first element.

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max_element) { //Checking Maximum element
                max_element = a[i];
            }

            if (a[i] < min_element) { //Checking Minimum element
                min_element = a[i];
            }
        }

        //Printing Result
        System.out.println("\n Maximum Number: " + max_element);
        System.out.println("\n Minimum Number: " + min_element);

    }

}
