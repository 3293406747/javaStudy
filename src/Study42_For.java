/**
 * 冒泡排序 二重循环
 */

import java.util.Arrays;

public class Study42_For {
    public static void main(String[] args) {
        int[] array = {8, 5, 9, 17, 6, -3, 0, 23, 17};
        // 外层循环 n-1
        for (int i = 0; i < array.length - 1; i++) {
            // 内层循环 n-1-i
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // 交换值
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
