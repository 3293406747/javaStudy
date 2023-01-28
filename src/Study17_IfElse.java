/**
 * if结构
 */

import java.util.Scanner;

public class Study17_IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score == 100) {
            System.out.println("满分");
        }
        System.out.println("程序结束");
    }
}
