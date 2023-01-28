/**
 * 函数重载
 * 函数支持同名 之间就叫函数重载
 * 函数重载原则： 1. 方法名不相同 2.参数列表不相同 3.与返回值无关
 * 优先适配合适的
 */

public class Study45_Function {
    public static void main(String[] args) {
        function(1);
        String i = function("2");
        System.out.println(i);
    }

    public static void function(int age1) {    // int
        System.out.println(age1);
    }

    public static void function(double age2) {    // double
        System.out.println(age2);
    }

    public static String function(String age3) {    // String
        return age3;
    }
}
