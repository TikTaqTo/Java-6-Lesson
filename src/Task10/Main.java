package Task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        String letter = in.next();
        int result = 0;

        for (int i = 0; i < n.length(); i++) {
            if(n.charAt(i) == letter.charAt(0)){
                result++;
            }
        }

        System.out.println(result);
    }
}
