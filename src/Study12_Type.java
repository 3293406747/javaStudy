/**
 * 规则1：如果一个操作数为double型，则整个表达式可提升为double型
 * 规则2：满足主动转换类型的条件
 * 两种类型要兼容：数值类型（整数和浮点数）相互兼容
 * 目标类型大于源类型：如double型大于int型
 */

public class Study12_Type {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        double num3 = num1 + num2;
        System.out.println(num3);
    }
}
