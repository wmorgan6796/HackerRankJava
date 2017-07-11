package Introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by William Morgan on 7/11/17.
 * Created at 2:57 PM.
 */
public class JavaStdinStdout2 {
    public static void main( String args[] ) {
        // Get a list of the objects from stdin.
        List<Object> ans = getInput();

        // Prints out the input as properly formatted output to stdout.
        System.out.println("String: " + ans.get(2));
        System.out.println("Double: " + (double)ans.get(1));
        System.out.println("Int: "    +    (int)ans.get(0));
    }

    /**
     * Reads input from stdin and returns them as a list of objects.
     * Reads in an int, a double and a String in that order.
     * @return A list of objects corresponding to the data read from stdin.
     */
    private static List<Object> getInput() {
        List<Object> list;
        list = new ArrayList<>();
        Scanner scan = null;
        try {

            scan = new Scanner(System.in);
            list.add( scan.nextInt() );
            list.add( scan.nextDouble() );
            scan.nextLine();
            list.add( scan.nextLine() );

        } catch( Exception e ) {
            e.printStackTrace();
        } finally {
            if( scan != null ) {
                try { scan.close(); } catch( Exception e ) { e.printStackTrace(); }
            }
        }

        return list;
    }
}
