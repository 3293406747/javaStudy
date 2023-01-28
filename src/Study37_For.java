/**
 * 双重循环打印正方形 外循环行 内循环*
 */

public class Study37_For {
    public static void main(String[] args) {
        int num = 4;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
