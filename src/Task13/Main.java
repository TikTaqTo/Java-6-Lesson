package Task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        String m = in.next();


        System.out.println(n.contains(m) ? "Yes" : "No");
    }
}
