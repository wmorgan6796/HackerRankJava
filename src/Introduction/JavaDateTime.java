package Introduction;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by William Morgan on 7/11/17.
 * Created at 3:23 PM.
 */
public class JavaDateTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt() - 1;
        int day = in.nextInt();
        int year = in.nextInt();

        int dayOfWeek = new Calendar
                .Builder()
                .setDate(year, month, day)
                .build()
                .get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("SHOULD NEVER HAPPEN!!");
        }
    }
}
