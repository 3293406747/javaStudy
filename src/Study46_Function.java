/**
 * 函数可变参数
 */

import java.util.Arrays;

public class Study46_Function {
    public static void main(String[] args) {
        function();
        function(1);
        function(1, 2, 3, 4, 5);
        int[] array = {1, 3, 5};
        function(array);    // 可以直接传一个int数组进去
    }

    public static void function(int... age) {    // int...实际上是传了个int数组
        System.out.println(Arrays.toString(age));
    }
}
