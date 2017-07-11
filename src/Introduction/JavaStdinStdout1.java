package Introduction;

import java.util.Scanner;

/**
 * Created by William Morgan on 7/11/17.
 * Created at 2:55 PM.
 */
public class JavaStdinStdout1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            int a = scan.nextInt();
            System.out.println(a);
        }

    }
}
