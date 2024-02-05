/*
char charAt(int index),
int length(),
String substring(),
isEmpty(),
String replace(),
String trim(),




 */
package java_all_string_class_methods;

public class Java_all_string_class_methods {

    public static void main(String[] args) {
        String s1 = "Pranto ";
        String s2 = "";
        String s3 = "My Name is pranto saha";
        System.out.println(s1.charAt(4));

        System.out.println(s1.length());

        System.out.println(s1.substring(2, 5));

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

        System.out.println(s1.replace("a", "o"));

        System.out.println(s3.indexOf("saha"));

        System.out.println(s1 + "Kumar");//without trim
        System.out.println(s1.trim() + "Kumar");//with trim

    }

}
