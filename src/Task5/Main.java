package Task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

        String firstWord = in.next();

        String oneLetter = in.next();

        int m = firstWord.indexOf(oneLetter);

        String answer = m > -1 ? String.valueOf(m) : "THERE IS NO SUCH LETTER";

        System.out.println(answer);
    }
}
