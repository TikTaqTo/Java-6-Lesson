package Task17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        String result = "";
        int aCounter = 0;

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'a') {
                aCounter++;
            }
            if (aCounter == 1 && n.charAt(i) == 'a') {
                result += 'o';
                aCounter = 0;
            } else {
                result += n.charAt(i);
            }
        }

        System.out.println(result);
    }
}
