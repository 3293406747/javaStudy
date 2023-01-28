/**
 * foreach输出(增强版for循环) 没有下标
 */

public class Study47_For {
    public static void main(String[] args) {
        int[] array = {1, 6, 2};
        // 自动循环array数组，也知道何时结束 每次取出一个元素放到变量i上
        for (int i : array) {
            System.out.println(i);
        }
    }
}
