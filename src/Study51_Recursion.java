/**
 * 使用递归 1加到100
 */

public class Study51_Recursion {
    public static void main(String[] args) {
        int res = sum(100);
        System.out.println(res);
    }

    public static int sum(int count) {
        if (count == 1) return 1;   // 结束条件
        return sum(count - 1) + count;    // 递归表达式
    }
}
