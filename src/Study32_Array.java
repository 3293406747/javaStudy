/**
 * 数组 只能存放同种数据类型
 */

public class Study32_Array {
    public static void main(String[] args) {
        // 声明一个数组，指明里面只能存放整数
        int[] arr;
        // 分配空间
        arr = new int[5];
        // 给里面的5个成员赋值
        arr[0] = 5;
        arr[2] = 8;
        arr[4] = 10;
        // 不需要赋值就能读，读出来是默认值
        System.out.println(arr[0]);
        System.out.println(arr[1]);

    }
}
