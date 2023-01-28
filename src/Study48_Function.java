/**
 * 函数基本数据类型传参 形参实参
 * 函数的实参传参，实际上是值拷贝的过程，函数内部修改形参的值，不影响实参的值
 * 类似于int i = x
 * 传参是值传递
 * 与python不同 python形参实参使用的同一个堆空间，不开辟新的堆空间
 */

public class Study48_Function {
    public static void main(String[] args) {
        int x = 1; // 实参
        function(x);
        System.out.println(x);
    }

    public static void function(int i) {     // 形参
        i++;
        System.out.println(i);
    }
}
