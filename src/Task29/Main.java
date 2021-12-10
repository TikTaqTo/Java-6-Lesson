package Task29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String reverse = new StringBuffer(str).reverse().toString();

        System.out.println(reverse);
    }
}

