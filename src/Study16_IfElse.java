/**
 * 条件判断 if else if(条件){
 * 代码片段1;
 * }else{
 * 代码片段2;
 * }
 */

import java.util.Scanner;

public class Study16_IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("prompt message:");
        int score = scanner.nextInt();
        if (score > 90) {
            System.out.println("优秀");
        } else {
            System.out.println("还没到优秀");
        }
    }
}
