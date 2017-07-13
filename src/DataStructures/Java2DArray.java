package DataStructures;

import java.util.Scanner;

/**
 * Created by William Morgan on 7/13/17.
 * Created at 10:37 AM.
 */
public class Java2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        findHourglass(arr);
    }

    private static void findHourglass(int arr[][]) {
        int sum = -70;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int temp = calculateHourglass(j, i, arr);

                if (temp > sum) {
                    sum = temp;
                }
            }
        }

        System.out.println(sum);
    }

    private static int calculateHourglass(int x, int y, int arr[][]) {
        return arr[y][x] + arr[y][x + 1] + arr[y][x + 2] + arr[y + 1][x + 1] + arr[y + 2][x] + arr[y + 2][x + 1] +
                arr[y + 2][x + 2];
    }
}