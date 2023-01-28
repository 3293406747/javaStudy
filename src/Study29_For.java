/**
 * for循环
 * 循环次数固定的
 * for (声明初始化循环变量; 条件; 修改循环变量){
 * 循环体;
 * }
 * 可声明多个变量 可修改多个循环变量
 * 死循环 相当于while(true)
 * for(;;){
 * System.out.println("aaa");
 * }
 */

public class Study29_For {
    public static void main(String[] args) {
        for (int i = 0, j = 6; i <= 6; i++, j--) {
            System.out.println(i + "+" + j + "=" + 6);
        }

    }
}
