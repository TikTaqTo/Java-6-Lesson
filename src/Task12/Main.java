package Task12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        String result = "";

        for (int i = n.length() - 1; i >= 0; i--) {
            result += n.charAt(i);
        }

        System.out.println(result);
    }
}
