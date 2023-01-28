/**
 * if elseif else结构
 * 1.多选一 2.从上往下判断，一旦为真，不在往下判断
 */

import java.util.Scanner;

public class Study18_IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("prompt int:");
        int score = scanner.nextInt();
        if (score>=90){
            System.out.println("优秀");
        }else if(score>=80){
            System.out.println("良好");
        }else if(score>=60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
    }
}
