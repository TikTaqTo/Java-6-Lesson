
package Task26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        String s1 = in.next();
        String s2 = in.next();

        String results = text.replaceAll(s1, s2);

        System.out.println(results);
    }
}
