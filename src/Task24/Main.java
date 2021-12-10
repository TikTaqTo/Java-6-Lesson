package Task24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();

        String result = toUP(n);

        System.out.println(result);
    }

    public static String toUP(String s) {
        char[] result = s.toCharArray();
        if(Character.isAlphabetic(result[0]))result[0]=Character.toUpperCase(result[0]);
        String res=""+result[0];
        for(int i=1;i<result.length;i++)
        {
            if(Character.isAlphabetic(result[i]) && !Character.isAlphabetic(result[i-1]))result[i]=Character.toUpperCase(result[i]);
            res+=result[i];
        }
        return res;
    }
}
