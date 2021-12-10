package Task21;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        String normalizedN = n.toLowerCase(Locale.ROOT);

        System.out.println(normalizedN);
    }
}
