/**
 * 八种基本数据类型
 * 整数
 * 1个字节 byte -128 -> +127
 * 2个字节 short
 * 3个字节 int
 * 4个字节 long
 * 小数
 * 4个字节 float      精度低，会丢精度
 * 8个字节 double     精度更高   也会丢精度
 * 字符
 * 两个字节 char
 * 布尔
 * 一个字节 不是数值 而是真假
 */

public class Study13_Type {
    public static void main(String[] args) {
        byte bi = Byte.MIN_VALUE;
        byte ba = Byte.MAX_VALUE;
        byte b = 1;
        System.out.println("b最小值:" + bi + "b最大值:" + ba + "b值:" + b);

        short si = Short.MIN_VALUE;
        short sa = Short.MAX_VALUE;
        short s = 1;
        System.out.println("s最小值:" + si + "s最大值:" + sa + "s值:" + s);

        int ii = Integer.MIN_VALUE;
        int ia = Integer.MAX_VALUE;
        int i = 1;
        System.out.println("i最小值:" + ii + "i最大值:" + ia + "i值:" + i);

        long li = Long.MIN_VALUE;
        long la = Long.MAX_VALUE;
        long l = 1;         // 大数后面加l
        System.out.println("l最小值:" + li + "l最大值:" + la + "l值:" + l);

        System.out.println(la + la);      // 输出错误值

        float fi = Float.MIN_VALUE;
        float fa = Float.MAX_VALUE;     // 3.4028235E38f 大约3后面有38个0
        float f = 3.14f;        // 后面加f
        System.out.println("f最小值:" + fi + "f最大值:" + fa + "f值:" + f);

        double di = Double.MIN_VALUE;
        double da = Double.MAX_VALUE;
        double d = 3.14;        // 大数后面加d 1.7976931348623157E308d 大约1后面有308个0
        System.out.println("d最小值:" + di + "d最大值:" + da + "d值:" + d);

        char ci = Character.MIN_VALUE;
        char ca = Character.MAX_VALUE;
        char c = 'a';
        System.out.println("c最小值:" + (int) ci + "c最大值:" + (int) ca + "d值:" + c);

        boolean bt = true;
        boolean bf = false;
        System.out.println("布尔值真:" + bt + "布尔值假:" + bf);
    }
}
