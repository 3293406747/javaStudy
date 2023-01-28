/**
 * 数据类型转换
 * 1.小的可以转大的  指大小值字节范围
 * 如: int范围-2147483648i至2147483647i char范围0至65535d
 * 2.强制转换 (目标类型)表达式
 * 3.布尔值不能转换
 */

public class Study14_Type {
    public static void main(String[] args) {
        char c1 = 'a';      // 小
        int i1 = 1;         // 大
        int i2 = c1 + i1;
        System.out.println(i2);
        char c2 = (char) i2;     // 强制转换
        System.out.println(c2);
    }
}
