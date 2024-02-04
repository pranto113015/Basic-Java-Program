package string_function;

public class String_function {

    public static void main(String[] args) {
        String s1 = "Aello";
        String s2 = "Aello";
        int c = s1.compareTo(s2);

        if (c == 0) {
            System.out.println("Two Strings are equal");
        } else if (c > 0) {
            System.out.println("1st String is greater than 2nd");
        } else {
            System.out.println("2nd string is greater");
        }
    }

}
