package DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by William Morgan on 7/13/17.
 * Created at 11:46 AM.
 */
public class JavaArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfLines = scan.nextInt();

        ArrayList <ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numOfLines; i++) {
            int numOfNums = scan.nextInt();
            ArrayList<Integer> tempList = new ArrayList<Integer>();
            list.add(tempList);
            for (int j = 0; j < numOfNums; j++) {
                list.get(i).add(scan.nextInt());
            }
        }

        int numOfQueries = scan.nextInt();

        for (int i = 0; i < numOfQueries; i++) {
            int x = scan.nextInt() - 1, y = scan.nextInt() - 1;
            if (x < list.size() && y < list.get(x).size()) {
                System.out.println(list.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
