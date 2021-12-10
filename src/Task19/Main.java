package Task19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        String n = in.next();

        System.out.println(n.charAt(0) + "" + m * 2);
    }
}
