package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        String m = in.next();

        if (n.equalsIgnoreCase(m)) {
            System.out.println("THEY ARE EQUAL");
        } else {
            System.out.println("THEY ARE NOT EQUAL");
        }
    }
}
