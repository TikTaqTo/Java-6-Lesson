package Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();

        String result = n.trim().replaceAll(" +", " ");

        System.out.println("(" + result + ")");
    }
}
