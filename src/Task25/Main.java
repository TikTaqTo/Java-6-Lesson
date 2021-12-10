package Task25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.nextLine();
        String results = "";

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '<') {
                for (int j = i + 1; j < n.length(); j++) {
                    if (n.charAt(i) != '>') {
                        results += n.charAt(j);
                    } else {
                        break;
                    }
                }
                results += " ";
            }
        }

        System.out.println(results);
    }
}
