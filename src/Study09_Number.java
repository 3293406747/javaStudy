/**
 * 赋值运算法
 * = += ++ - -= -- * *= /= % %=
 */

public class Study09_Number {
    public static void main(String[] args) {
        int age = 18;
        age += 1;
        age++;     //  等价于age += 1
        System.out.println(age);

        int year = 2022;
        year %= 10;     // 余数 等价于 year = year % 10
        System.out.println(year);

        int money = 202;
        money /= 10;
        System.out.println(money);      // 整数除一个数结果是个整数

        double num = 202;
        num /= 10;
        System.out.println(num);     // 浮点数除一个数结果是浮点数

        System.out.println(2.0 * 2);     // 未使用变量
        System.out.println("hello world");      // 未使用变量
    }
}
