/**
 * 数组
 * Arrays.sort(arr1) 数组arr升序排序
 * Arrays.toString(arr1) 将数组arr转换为一个字符串
 * boolean Arrays.equals(arr1,arr2) 比较两个数组是否相等
 * void fill(array,val) 将数组所有元素都赋值为val
 * copyOf(array,length) 将数组array复制为一个长度为length的新数组，返回类型与复制的数组一致
 * int binarySearch(array,val) 二分查询元素值val在数组array中的下标(要求数组元素已按升序排序)
 */

import java.util.Arrays;

public class Study35_Array {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 2, 1};
        Arrays.sort(arr1);   // 数组arr升序排序
        // System.out.println(arr1);    // 输出 [代表一维数组 I代表为int数组
        System.out.println(Arrays.toString(arr1));   // 将数组arr转换为一个字符串
        int[] arr2 = {3, 4, 5, 2, 1};
        boolean bResult = Arrays.equals(arr1, arr2);  // 比较两个数组（有序）是否相等
        System.out.println(bResult);
        int[] arr3 = new int[5];
        Arrays.fill(arr3, 11);   // 给数组内元素复制为同一个值
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOf(arr3, arr3.length);  // 数组复制
        System.out.println(Arrays.toString(arr4));
        int index = Arrays.binarySearch(arr1, 3);    // 二分查询元素下标 没有找到返回负数
        System.out.println(index);
    }
}
