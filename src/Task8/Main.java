package Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();

        for (int i = 0; i < n.length(); i++) {
            System.out.println(n.charAt(i));
        }
    }
}
