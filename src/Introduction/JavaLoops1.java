package Introduction;

import java.util.Scanner;

/**
 * Created by William Morgan on 7/11/17.
 * Created at 3:03 PM.
 */
public class JavaLoops1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int given = sc.nextInt();

        if (given >= 2 && given <= 20)
            for (int i = 1; i <= 10; i++)
                System.out.printf("%d x %d = %d\n", given, i, given * i);
    }
}
