import java.util.Arrays;

public class TwoD_arr {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 1, 7, 8},
                {45, 78, 45, 34},
                {23, 45, 67, 69},
                {11, 22, 33, 44},
        };
        int target = 45;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}