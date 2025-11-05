import java.util.Scanner;
public class SpookyConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String a = sc.nextLine();
        a = a.replace('-', '~');
        a = a.replace('_', '~');
        String res = "";
        boolean upper = true;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (upper) {
                    res += Character.toUpperCase(c);
                } else {
                    res += Character.toLowerCase(c);
                }
                upper = !upper;
            } else {
                res = res + c;
            }
        }

        System.out.println(res);
    }
}