package Task16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        String m = in.next();
        boolean isNiceString = true;

        if (n.length() != m.length()) {
            isNiceString = false;
        } else {
            for (int i = 0, j = m.length() - 1; i < n.length(); i++, j--) {
                if (n.charAt(i) != m.charAt(j)) {
                    isNiceString = false;
                    break;
                }
            }
        }

        System.out.println(isNiceString ? "Yes" : "No");
    }
}
