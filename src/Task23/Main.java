package Task23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        int result = 0;

        for (int i = 0; i < n.length(); i++) {
            if (Character.isLetter(n.charAt(i))) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}
