package Task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        int result = 0;

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'u'){
                result++;
            }
        }

        System.out.println(result);
    }
}
