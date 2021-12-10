package Task15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        String numberOnly= n.replaceAll("[^0-9]", "");
        int result = 0;

        for (int i = 0; i < numberOnly.length(); i++) {
            result += numberOnly.charAt(i) - '0';
        }

        System.out.println(result);
    }
}
