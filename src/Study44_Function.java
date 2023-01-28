/**
 * 函数入门
 * 共有的访问修饰符public 静态的static 没有返回值的void 方法名(参数列表（0个或多个）){}
 * public static void func(){
 * return;     return;可省略
 * }
 * 共有的访问修饰符public 静态的static 有返回值的int 方法名(参数列表（0个或多个）){}
 * public static int func(){
 * return num;
 * }
 * 方法不调用不执行
 */

public class Study44_Function {
    public static void main(String[] args) {
        function01();           // 没返回值的不可接收
        int i = function02();   // 有返回值可用变量接收返回值，也可以不接收
        System.out.println(i);
        function03("test", 18); // 参数必须给定 注意顺序
    }

    public static void function01() {
        System.out.println("hello world");
    }

    public static int function02() {
        return 100;
    }

    public static void function03(String name, int age) {
        System.out.println("my name is " + name + ". " + "my age is " + age + ".");
    }
}
