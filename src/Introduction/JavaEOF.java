package Introduction;

import java.util.Scanner;

/**
 * Created by William Morgan on 7/5/17.
 * Created at 2:44 PM.
 */

class JavaEOF {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;

        while (sc.hasNext()) {
            System.out.printf("%d %s\n", ++counter, sc.nextLine());

        }
    }
}
