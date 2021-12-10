package Task18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        boolean isPalindrome = true;

        for (int i = 0, j = n.length() - 1; i < n.length(); i++, j--) {
            if (n.charAt(i) != n.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Yes" : "No");

    }
}
