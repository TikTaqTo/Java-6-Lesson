package Task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        String result = "";

        for (int i = 0; i < n.length(); i++) {
            result += n.charAt(i);
            result += n.charAt(i);
        }

        System.out.println(result);
    }
}
