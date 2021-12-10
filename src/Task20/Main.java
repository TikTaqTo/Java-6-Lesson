package Task20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        String n = in.next();

        minCalculator(a,b,n.charAt(0));
    }

    public static void minCalculator(int a, int b, char operation){
        switch (operation){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '*':
                System.out.println(a*b);
                break;
        }
    }
}
