package Task22;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        String result = "";

        for (int i = 0; i < n.length(); i++) {
            if (Character.isDigit(n.charAt(i))) {
                result += '0';
            } else {
                result += n.charAt(i);
            }
        }

        System.out.println(result);
    }
}
