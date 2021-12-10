
package Task27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        String result = wordNumberConverter(text);

        System.out.println(result);
    }

    public static String wordNumberConverter(String text) {
        String[] words = text.split("\\s");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            switch (words[i]) {
                case "zero":
                    result += '0';
                    break;
                case "one":
                    result += '1';
                    break;
                case "two":
                    result += '2';
                    break;
                case "three":
                    result += '3';
                    break;
                case "four":
                    result += '4';
                    break;
                case "five":
                    result += '5';
                    break;
                case "six":
                    result += '6';
                    break;
                case "seven":
                    result += '7';
                    break;
                case "eight":
                    result += '8';
                    break;
                case "nine":
                    result += '9';
                    break;
                case "ten":
                    result += "10";
                    break;
                default:
                    result += words[i];
            }
        }
        return result;
    }
}
