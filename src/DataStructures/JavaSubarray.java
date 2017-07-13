package DataStructures;

import java.util.Scanner;

/**
 * Created by William Morgan on 7/13/17.
 * Created at 11:02 AM.
 */
public class JavaSubarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        int[] nums = new int[count];

        for (int i = 0; i < count; i++) {
            nums[i] = scan.nextInt();
        }
        System.out.println(findNegativeSums(nums));
    }

    private static int findNegativeSums(int [] nums) {
        int negs = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negs++;
            }
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];

                if (sum < 0) {
                    negs++;
                }
            }
        }

        return negs;
    }
}
