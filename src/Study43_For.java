/**
 * 二维数组及二维数组遍历
 */

public class Study43_For {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 9},
                {1, 8, 2, 7},
                {3, 1, 9, 4}
        };
        // 外层循环 行
        for (int[] ints : arr) {
            // 内层循环 行内数据
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
}
