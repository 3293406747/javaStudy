/**
 * 函数引用数据类型传参 形参实参
 * 与python相同 python形参实参使用的同一个堆空间，不开辟新的堆空间
 * 传参是地址传递
 */

import java.util.Arrays;

public class Study49_Function {
    public static void main(String[] args) {
        int[] arr = {2,1,4}; // 实参
        function(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void function(int[] array){     // 形参
        array[0]++;
        System.out.println(Arrays.toString(array));
    }
}
