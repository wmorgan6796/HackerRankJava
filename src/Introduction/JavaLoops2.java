package Introduction;

import java.util.Scanner;

/**
 * Created by William Morgan on 7/11/17.
 * Created at 3:02 PM.
 */
public class JavaLoops2 {

    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            if (a >= 0 && b <= 50 && n >= 1 && n <= 15 && t <= 500 && t >= 0)
                math(a, b, n);
        }

        in.close();
    }

    private static int powerOf2(int exponent) {
        int product = 0;

        for (int i = 0; i <= exponent; i++) {
            if (i == 0)
                product = 1;
            else
                product *= 2;
        }

        return product;
    }

    private static void math (int a, int b, int n) {
        int sum = a;

        for (int i = 0; i < n; i++) {
            if (i != 0)
                System.out.print(" ");

            sum += powerOf2(i) * b;
            System.out.print(sum);
        }
        System.out.print("\n");
    }
}
