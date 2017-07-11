package Introduction;

import java.util.Scanner;

/**
 * Created by William Morgan on 7/11/17.
 * Created at 2:56 PM.
 */
public class JavaIfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String ans = "";

        if ((n > 1) && (n <= 100)) {
            if (n % 2 == 1 || (n % 2 == 0 && (n > 5 && n < 21))) {
                ans = "Weird";
            } else if (n % 2 == 0 && ((n > 1 && n < 6) || n > 20)) {
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
    }
}
