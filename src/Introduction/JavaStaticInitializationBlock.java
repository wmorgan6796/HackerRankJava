package Introduction;

import java.util.Scanner;

/**
 * Created by William Morgan on 7/11/17.
 * Created at 3:07 PM.
 */
public class JavaStaticInitializationBlock {

    private static int B;
    private static int H;
    private static boolean flag = init();

    private static Boolean init() {
        try (Scanner sc = new Scanner(System.in)) {

            B = sc.nextInt();
            H = sc.nextInt();
        }

        flag = B > 0 && H > 0;

        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        return flag;
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}
