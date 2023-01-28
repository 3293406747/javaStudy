/**
 * 双重循环打印倒直角三角形 外循环行 内循环*
 */

public class Study39_For {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
